package com.vitor.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.spring.entities.User;
import com.vitor.spring.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return this.repository.findAll();
	}
	
	public User finById(Long id) {
		Optional<User> obj = this.repository.findById(id);
		return obj.get();
	}

}
