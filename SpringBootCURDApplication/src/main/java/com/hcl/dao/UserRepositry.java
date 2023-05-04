package com.hcl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.User;

public interface UserRepositry extends JpaRepository<User, Integer> {

}
