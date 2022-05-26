package com.spring.rest.exception_headling;

public class NoSuchEmployeeException extends RuntimeException {

    public NoSuchEmployeeException (String message) {
        super (message);
    }
}
