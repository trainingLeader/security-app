package com.appsecurity.security_app.application.services;



import com.appsecurity.security_app.domain.dto.UserDto;
import com.appsecurity.security_app.domain.entities.security.User;

import java.util.Optional;
public interface IUserService {
    User registrOneCustomer(UserDto newUser);

    Optional<User> findOneByUsername(String username);
}
