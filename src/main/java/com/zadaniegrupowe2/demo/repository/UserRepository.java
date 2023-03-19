package com.zadaniegrupowe2.demo.repository;

import com.zadaniegrupowe2.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
