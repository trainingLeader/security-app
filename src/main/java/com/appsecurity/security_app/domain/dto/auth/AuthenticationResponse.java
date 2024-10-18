package com.appsecurity.security_app.domain.dto.auth;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable{
    private String jwt;

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
    
}
