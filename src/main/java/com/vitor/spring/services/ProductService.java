package com.vitor.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.spring.entities.Product;
import com.vitor.spring.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return this.repository.findAll();
	}
	
	public Product finById(Long id) {
		Optional<Product> obj = this.repository.findById(id);
		return obj.get();
	}

}
