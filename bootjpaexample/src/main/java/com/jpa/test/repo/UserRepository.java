package com.jpa.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
