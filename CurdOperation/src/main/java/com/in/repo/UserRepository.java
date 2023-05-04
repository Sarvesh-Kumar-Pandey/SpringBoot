package com.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
