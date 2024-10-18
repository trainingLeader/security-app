package com.appsecurity.security_app.infrastructure.repositories.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;

import com.appsecurity.security_app.application.services.IUserService;
import com.appsecurity.security_app.domain.dto.UserDto;
import com.appsecurity.security_app.domain.entities.User;
import com.appsecurity.security_app.infrastructure.utils.enums.Role;
import com.appsecurity.security_app.infrastructure.utils.exceptions.InvalidPasswordException;

public class UserImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User registrOneCustomer(UserDto newUser) {
        validatePassword(newUser);

        User user = new User();
        user.setPassword(passwordEncoder.encode(newUser.getPassword()));
        user.setUsername(newUser.getUsername());
        user.setName(newUser.getName());
        user.setRole(Role.ROLE_CUSTOMER);

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findOneByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    private void validatePassword(UserDto dto) {

        if(!StringUtils.hasText(dto.getPassword()) || !StringUtils.hasText(dto.getRepeatedPassword())){
            throw new InvalidPasswordException("Passwords don't match");
        }

        if(!dto.getPassword().equals(dto.getRepeatedPassword())){
            throw new InvalidPasswordException("Passwords don't match");
        }

    }

}
