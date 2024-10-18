package com.appsecurity.security_app.application.services.auth;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

import com.appsecurity.security_app.application.services.IUserService;
import com.appsecurity.security_app.domain.dto.RegisterUser;
import com.appsecurity.security_app.domain.dto.UserDto;
import com.appsecurity.security_app.domain.entities.User;

@Service
public class AuthenticationService {

    @Autowired
    private IUserService userService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    public RegisterUser registerOneCustomer(UserDto newUser){
        User user = userService.registrOneCustomer(newUser);
        
        RegisterUser userDto = new RegisterUser();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setUsername(user.getUsername());
        userDto.setRole(user.getRole().name());

        String jwt = jwtService.generateToken(user, generateExtraClaims(user));
        userDto.setJwt(jwt);

        return userDto;
    }
    private Map<String, Object> generateExtraClaims(User user) {
        Map<String, Object> extraClaims = new HashMap<>();
        extraClaims.put("name",user.getName());
        extraClaims.put("role",user.getRole().name());
        extraClaims.put("authorities",user.getAuthorities());

        return extraClaims;
    }
}
