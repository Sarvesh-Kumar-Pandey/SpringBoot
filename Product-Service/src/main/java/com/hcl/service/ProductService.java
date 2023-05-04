package com.hcl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Product;
import com.hcl.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;

	public List<Product> getAllProduct(){

		return productRepo.findAll();
	}
	
	public Optional<Product> getProductById(int pid){

		return productRepo.findById(pid);
	}
	
	public Product saveProduct(Product product){

		return productRepo.save(product);
	}

}
