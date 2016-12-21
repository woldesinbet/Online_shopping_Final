package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.service.ShoppingCartService;

@Controller
public class ShoppingCartController {
	@Autowired
	ShoppingCartService shoppingService;

	@RequestMapping(value = "/addShoppingCart{productId}")

	public String addCart(@RequestParam("id") Long productId) {

		shoppingService.saveShoppingCart(productId);
		return "redirect:/viewShoppingCart";
	}

	@RequestMapping(value = "/viewShoppingCart")
	public String viewCart(Model model) {

		model.addAttribute("cartList", shoppingService.getAll());
		return "cartList";
	}

	@RequestMapping(value = "/removeCartItems{id}", method = RequestMethod.GET)
	public String delete(@RequestParam("id") Long id) {

		shoppingService.removeCartItem(id);
		return "cartList";
	}

}
