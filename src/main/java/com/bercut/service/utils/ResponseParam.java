package com.bercut.service.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ResponseParam<T> {

    private String description;

    private T value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String result;

    public ResponseParam(String description) {
        this.description = description;
        this.value = null;
        this.result = null;
    }

    public ResponseParam(String description, T value, String result) {
        this.description = description;
        this.value = value;
        this.result = result;
    }
}
