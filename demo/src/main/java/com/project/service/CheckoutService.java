package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Paymentinfo;
import com.project.repository.CheckoutRepository;

@Service
public class CheckoutService {
	@Autowired
	CheckoutRepository checkoutrepository;

	public void save(Paymentinfo payment) {
		checkoutrepository.save(payment);
	}

}
