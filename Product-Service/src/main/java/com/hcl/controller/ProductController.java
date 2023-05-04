package com.hcl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Product;
import com.hcl.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/")
	public List<Product> getProduct(){
		return productService.getAllProduct();
		
	}
	
	@PostMapping("/")
	public Product saveProduct(@RequestBody Product p) {
		
		return productService.saveProduct(p);
	}
	
	@GetMapping("{id}")
	public Optional<Product> getProductById(@PathVariable("id") int id){
		return productService.getProductById(id);
		
	}

}
