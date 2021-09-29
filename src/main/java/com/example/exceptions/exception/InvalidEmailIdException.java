package com.example.exceptions.exception;

public class InvalidEmailIdException extends Exception{
    @Override
    public String getMessage() {
        return "The Email is not valid";
    }
}
