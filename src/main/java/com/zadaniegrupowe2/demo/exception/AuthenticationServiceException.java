package com.zadaniegrupowe2.demo.exception;

public class AuthenticationServiceException extends RuntimeException{
    public AuthenticationServiceException(String message) {
        super(message);
    }
}
