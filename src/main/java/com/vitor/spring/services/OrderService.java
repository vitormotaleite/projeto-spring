package com.vitor.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.spring.entities.Order;
import com.vitor.spring.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return this.repository.findAll();
	}
	
	public Order finById(Long id) {
		Optional<Order> obj = this.repository.findById(id);
		return obj.get();
	}

}
