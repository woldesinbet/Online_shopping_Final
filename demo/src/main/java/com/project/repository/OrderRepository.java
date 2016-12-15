package com.project.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long>{

}
