package com.appsecurity.security_app.infrastructure.repositories.role;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.appsecurity.security_app.domain.entities.security.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String defaultRole);
}
