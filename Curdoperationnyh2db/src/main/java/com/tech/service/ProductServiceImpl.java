package com.tech.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.model.Product;
import com.tech.repo.ProductRepository;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Override
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}

	public Product updateProduct(long productId) {
		Optional<Product> productDb=this.productRepository.findById(productId);
		 Product productupdate=productDb.get();
		 productupdate.setId(1000);
		 productupdate.setName("Sarvesh");
		 productupdate.setDesc("developer");
		 return productupdate;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return this.productRepository.findAll();
	}

	@Override
	public Product getProductById(long productId) {
		Optional<Product> productDb=this.productRepository.findById(productId);
		return productDb.get();
	}

	@Override
	public void deleteProduct(long productId) {
		Optional<Product> productDb=this.productRepository.findById(productId);
		 this.productRepository.delete(productDb.get());
	}

}
