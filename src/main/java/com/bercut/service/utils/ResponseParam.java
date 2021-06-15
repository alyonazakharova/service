package com.bercut.service.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ResponseParam<T> {

    private final T value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String description;

    public ResponseParam(T value) {
        this.value = value;
        this.description = null;
    }

    public ResponseParam(T value, String description) {
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
