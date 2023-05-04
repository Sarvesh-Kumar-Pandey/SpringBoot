package com.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
