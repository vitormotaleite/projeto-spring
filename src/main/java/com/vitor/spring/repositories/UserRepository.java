package com.vitor.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.spring.entities.Users;

public interface UserRepository extends JpaRepository<Users,Long> {

}
