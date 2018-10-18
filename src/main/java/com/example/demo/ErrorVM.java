package com.example.demo;

import java.io.Serializable;

public class ErrorVM implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String message;
    private final String description;
    private final String path;

    public ErrorVM(String message, String description, String path) {
        this.message = message;
        this.description = description;
        this.path = path;

    }

    public String getMessage() {
        return message;

    }

    public String getDescription() {
        return description;

    }

    public String getPath() {
        return path;

    }
}