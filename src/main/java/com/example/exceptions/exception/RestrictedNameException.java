package com.example.exceptions.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class RestrictedNameException extends Exception{
    @Override
    public String getMessage() {
        return "Name Cannot be used";
    }
}
