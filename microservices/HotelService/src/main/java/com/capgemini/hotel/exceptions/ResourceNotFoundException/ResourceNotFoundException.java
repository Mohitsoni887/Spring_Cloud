package com.capgemini.hotel.exceptions.ResourceNotFoundException;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String s) {
        super(s);
    }

    public ResourceNotFoundException() {
        super("Resource not Found");
    }
}
