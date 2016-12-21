package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.model.Paymentinfo;
import com.project.service.CheckoutService;

@Controller
public class CheckoutController {
	@Autowired
	CheckoutService checkoutservice;

	@RequestMapping(value = { "/checkout" }, method = RequestMethod.GET)
	public String makePayement(@ModelAttribute("newCheckout") Paymentinfo newCheckout) {
		return "checkout";
	}

	@RequestMapping(value = { "/checkout" }, method = RequestMethod.POST)
	public String addPayment(@ModelAttribute("newCheckout") Paymentinfo newCheckout) {
		checkoutservice.save(newCheckout);
		return "redirect:/checkoutSucess";
	}

	@RequestMapping("/checkoutSucess")
	public String sucess() {
		return "successPage";
	}

}
