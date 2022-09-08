package com.vitor.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
