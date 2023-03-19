package com.zadaniegrupowe2.demo.service;

import com.zadaniegrupowe2.demo.entity.Part;
import com.zadaniegrupowe2.demo.entity.PartType;
import com.zadaniegrupowe2.demo.exception.PartServiceException;
import com.zadaniegrupowe2.demo.repository.PartRepository;
import com.zadaniegrupowe2.demo.request.AddPartRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

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
            throw new PartServiceException("Cena min. 1");
        }
        PartType type = PartType.valueOf(request.getVehicleType().toString());
        Part part = new Part(request.getName(),request.getPrice(), type);
        repository.save(part);
    }
}
