package com.zadaniegrupowe2.demo.repository;

import com.zadaniegrupowe2.demo.entity.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part, Long> {
}
