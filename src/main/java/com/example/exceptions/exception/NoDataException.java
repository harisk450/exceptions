package com.example.exceptions.exception;

public class NoDataException extends Exception{
    @Override
    public String getMessage() {
        return "Data not Found";
    }
}
