package com.bercut.service.response;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ParamWithDescription<T> {

    private final T value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String description;

    public ParamWithDescription(T value) {
        this.value = value;
//        this.description = "OK";
        this.description = null;
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
