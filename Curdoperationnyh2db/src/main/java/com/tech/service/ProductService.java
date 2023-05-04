package com.tech.service;

import java.util.List;

import com.tech.model.Product;

public interface ProductService {
        Product createProduct(Product product);
        Product updateProduct(long productId);
        List<Product> getAllProduct();
        Product getProductById(long productId);
        void deleteProduct(long id);
		
}