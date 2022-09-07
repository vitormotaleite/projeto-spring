package com.vitor.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
