package com.vitor.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.spring.entities.Category;
import com.vitor.spring.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return this.repository.findAll();
	}
	
	public Category finById(Long id) {
		Optional<Category> obj = this.repository.findById(id);
		return obj.get();
	}

}
