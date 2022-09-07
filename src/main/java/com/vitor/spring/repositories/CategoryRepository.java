package com.vitor.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
