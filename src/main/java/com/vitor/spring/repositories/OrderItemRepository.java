package com.vitor.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
