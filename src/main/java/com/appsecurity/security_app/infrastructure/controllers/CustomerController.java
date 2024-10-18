package com.appsecurity.security_app.infrastructure.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsecurity.security_app.application.services.auth.AuthenticationService;
import com.appsecurity.security_app.domain.dto.RegisterUser;
import com.appsecurity.security_app.domain.dto.UserDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping
    public ResponseEntity<RegisterUser> registerOne(@RequestBody @Valid UserDto newUser){
        RegisterUser registeredUser = authenticationService.registerOneCustomer(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredUser);
    }
}
