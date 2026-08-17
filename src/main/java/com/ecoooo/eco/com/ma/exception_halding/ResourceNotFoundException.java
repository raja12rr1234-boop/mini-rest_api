package com.ecoooo.eco.com.ma.exception_halding;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail; 
import org.springframework.web.ErrorResponseException;

public class ResourceNotFoundException extends ErrorResponseException {

    public ResourceNotFoundException(String message) {
        super(
            HttpStatus.NOT_FOUND,
            ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, message),
            null
        );
    }
}