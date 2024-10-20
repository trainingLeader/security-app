package com.appsecurity.security_app.application.services;

import java.util.Optional;

import com.appsecurity.security_app.domain.entities.security.Role;

public interface IRoleService {
    Optional<Role> findDefaultRole();
}
