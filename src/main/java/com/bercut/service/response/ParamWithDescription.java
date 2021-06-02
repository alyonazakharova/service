package com.bercut.service.response;

public class ParamWithDescription<T> {
    private final T value;
    private final String description;

    public ParamWithDescription(T value) {
        this.value = value;
        this.description = "OK";
    }

    public ParamWithDescription(T value, String description) {
        this.value = value;
        this.description = description;
    }

    public T getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
