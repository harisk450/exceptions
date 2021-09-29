package com.example.exceptions.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(RestrictedNameException.class)
    public ResponseEntity<String> restrictedNameException(RestrictedNameException re){
        return new ResponseEntity<>(re.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(InvalidEmailIdException.class)
    public ResponseEntity<String> invalidEmailIdException(InvalidEmailIdException re){
        return new ResponseEntity<>(re.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoDataException.class)
    public ResponseEntity<String> noDataException(NoDataException re){
        return new ResponseEntity<>(re.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
