package com.appsecurity.security_app.application.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.appsecurity.security_app.domain.dto.CategoryDto;
import com.appsecurity.security_app.domain.entities.Category;

public interface ICategoryService {
    Page<Category> findAll(Pageable pageable);

    Optional<Category> findOneById(Long categoryId);

    Category createOne(CategoryDto saveCategory);

    Category updateOneById(Long categoryId, CategoryDto saveCategory);

    Category disableOneById(Long categoryId);
}
