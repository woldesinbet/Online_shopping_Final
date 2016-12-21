package com.project.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.ShoppingCart;


@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>{
	
	
}
