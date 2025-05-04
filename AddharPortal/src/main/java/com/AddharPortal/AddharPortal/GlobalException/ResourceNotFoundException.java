package com.AddharPortal.AddharPortal.GlobalException;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String mobileNumberIsNotRegistered) {
    }
    public ResourceNotFoundException(){
        super("Resource not found");

    }
}
