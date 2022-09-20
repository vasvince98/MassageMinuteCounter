package com.vasvince.massageminutecounter.Exceptions;

public class UserNotFoundException extends RuntimeException {

    private final String message;

    public UserNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
