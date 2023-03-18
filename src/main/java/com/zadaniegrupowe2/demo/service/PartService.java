package com.zadaniegrupowe2.demo.service;

import com.zadaniegrupowe2.demo.exception.PartServiceException;
import com.zadaniegrupowe2.demo.request.AddPartRequest;
import org.springframework.stereotype.Service;

@Service
public class PartService {

    public void addPart(AddPartRequest request) {
        if (request.getName().isBlank()) {
            throw new PartServiceException("Nie uzupełniono nazwy!");
        } else if (request.getPrice() <= 0) {
            throw new PartServiceException("Cena min. 1");
        }
        System.out.println("Wszystko ok, dodaję");
    }
}
