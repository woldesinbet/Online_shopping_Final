package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.model.Product;
import com.project.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	public void addProduct(Product	 product){
		productRepository.save(product);
		
	}
	public List<Product> viewProduct(){
		return (List<Product>) productRepository.findAll();
	}
	public void delete(long id){
		productRepository.delete(id);
	}
	
	public Product viewById(long id){
		return productRepository.findOne(id);
	}

}
