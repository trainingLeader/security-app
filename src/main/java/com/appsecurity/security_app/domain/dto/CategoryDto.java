package com.appsecurity.security_app.domain.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class CategoryDto implements Serializable {
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
