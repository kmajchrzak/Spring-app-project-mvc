package com.zadaniegrupowe2.demo.repository;

import com.zadaniegrupowe2.demo.entity.Part;
import com.zadaniegrupowe2.demo.entity.PartType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartRepository extends JpaRepository<Part, Long> {
    List<Part>findByType(PartType type);
}
