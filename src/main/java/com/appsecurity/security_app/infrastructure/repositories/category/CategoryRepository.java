package com.appsecurity.security_app.infrastructure.repositories.category;



import org.springframework.data.jpa.repository.JpaRepository;

import com.appsecurity.security_app.domain.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
