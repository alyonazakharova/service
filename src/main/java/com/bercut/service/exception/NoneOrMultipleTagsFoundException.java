package com.bercut.service.exception;

public class NoneOrMultipleTagsFoundException extends RuntimeException {
    public NoneOrMultipleTagsFoundException(String message) {
        super(message);
    }
}
