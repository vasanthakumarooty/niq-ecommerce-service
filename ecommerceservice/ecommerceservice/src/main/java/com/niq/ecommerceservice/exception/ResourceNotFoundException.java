package com.niq.ecommerceservice.exception;

public class ResourceNotFoundException  extends RuntimeException {
    public ResourceNotFoundException(String message)
    {
        super(message);
    }
}
