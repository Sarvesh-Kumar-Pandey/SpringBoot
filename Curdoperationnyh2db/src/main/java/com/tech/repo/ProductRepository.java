package com.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
