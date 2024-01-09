package com.aps.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aps.jwt.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
