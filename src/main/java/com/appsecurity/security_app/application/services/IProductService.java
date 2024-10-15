package com.appsecurity.security_app.application.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.appsecurity.security_app.domain.dto.ProductDto;
import com.appsecurity.security_app.domain.entities.Product;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);

    Optional<Product> findOneById(Long productId);

    Product createOne(ProductDto saveProduct);

    Product updateOneById(Long productId, ProductDto saveProduct);

    Product disableOneById(Long productId);
}
