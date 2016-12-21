package com.project.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.model.Product;
import com.project.model.ShoppingCart;
import com.project.repository.ProductRepository;
import com.project.repository.ShoppingCartRepository;



@Service
@Transactional
public class ShoppingCartService {

	@Autowired 
	ShoppingCartRepository shoppingCartRepository;
	@Autowired
	ProductRepository productRepository;
	
 
	public ShoppingCart getById(Long Id) {
		 
		return shoppingCartRepository.findOne(Id);
		 
	}

	public List<ShoppingCart> getAll() {
		 
		return (List<ShoppingCart>) shoppingCartRepository.findAll();
	}
	 

	public void saveShoppingCart(Long productId) {
		 
		 Product product = productRepository.findOne(productId);
		 ShoppingCart sc = new ShoppingCart();
		 sc.setQuantity(1);
		 List<Product>allProduct= new ArrayList<>();
		 allProduct.add(product);
		 sc.setHoldsproducts(allProduct);
		 shoppingCartRepository.save(sc);
		
			 
			
		 }
	public void removeCartItem(Long id){
		shoppingCartRepository.delete(id);
		
	}	 	
	
	 
}
