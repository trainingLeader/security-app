package com.appsecurity.security_app.infrastructure.repositories.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appsecurity.security_app.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
