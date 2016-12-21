package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Orders;
import com.project.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;

	public void addOrder(Orders order) {
		orderRepository.save(order);

	}

	public List<Orders> viewOrders() {
		return (List<Orders>) orderRepository.findAll();
	}

	public void delete(long id) {
		orderRepository.delete(id);
	}

	public Orders viewById(long id) {
		return orderRepository.findOne(id);
	}

}
