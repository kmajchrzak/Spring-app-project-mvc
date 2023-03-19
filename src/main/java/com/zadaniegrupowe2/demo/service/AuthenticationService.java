package com.zadaniegrupowe2.demo.service;

import com.zadaniegrupowe2.demo.entity.User;
import com.zadaniegrupowe2.demo.exception.AuthenticationServiceException;
import com.zadaniegrupowe2.demo.repository.UserRepository;
import com.zadaniegrupowe2.demo.request.RegisterRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private UserRepository userRepository;
    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void createUser(RegisterRequest request){
        if(request.getPassword1().length() <5){
            throw new AuthenticationServiceException("Hasło minimum 6 zanków");
        }
        if (!request.getPassword1().equals(request.getPassword2())){
            throw new AuthenticationServiceException("Podano różne hasła");
        }
        if(userRepository.existsById(request.getUserName())){
            throw new AuthenticationServiceException("Ta nazwa jest już zajęta");}
       User user = new User(request.getUserName(), request.getPassword1());
        userRepository.save(user);


    }
}

