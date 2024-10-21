package com.appsecurity.security_app.infrastructure.repositories.role;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.appsecurity.security_app.application.services.IRoleService;
import com.appsecurity.security_app.domain.entities.security.Role;

@Service
public class RoleImpl implements IRoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Value("${security.default.role}")
    private String defaultRole;

    @Override
    public Optional<Role> findDefaultRole() {
        return roleRepository.findByName(defaultRole);
    }
}
