package com.zadaniegrupowe2.demo.service;

import com.zadaniegrupowe2.demo.entity.Part;
import com.zadaniegrupowe2.demo.entity.PartType;
import com.zadaniegrupowe2.demo.exception.PartServiceException;
import com.zadaniegrupowe2.demo.repository.PartRepository;
import com.zadaniegrupowe2.demo.request.AddPartRequest;
import com.zadaniegrupowe2.demo.request.PartFilterRequest;
import com.zadaniegrupowe2.demo.response.PartResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PartService {
    private PartRepository repository;

    public PartService(PartRepository repository) {
        this.repository = repository;
    }

    public void addPart(AddPartRequest request) {
        if (request.getName().isBlank()) {
            throw new PartServiceException("Nie uzupełniono nazwy!");
        } else if (request.getPrice() <= 0) {
            throw new PartServiceException("Cena nie może być 0");
        }
        PartType type = PartType.valueOf(request.getPartType());
        Part part = new Part(request.getName(), request.getPrice(), type);
        repository.save(part);
    }

    public List<PartResponse> getAllParts() {
        return repository.findAll().stream()
                .map(p -> new PartResponse(p.getName(), p.getPrice(), p.getType()))
                .toList();
    }

    public List<PartResponse> getParts(PartFilterRequest filterRequest) {
        PartType type = PartType.valueOf(filterRequest.getPartType());
        return repository.findByType(type).stream() //todo zrobic nową metodę w PartRepository
                .map(p -> new PartResponse(p.getName(), p.getPrice(), p.getType()))
                .toList();
    }
}
