package com.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.model.Product;
import com.project.service.ProductService;

@Controller
public class ProductController {
@Autowired 
private ProductService  productService;


@RequestMapping("/deleteProduct")
public String deleteProductById(@RequestParam("id") Long productId, Model model) {
	productService.delete(productId);
	return "redirect:/products";
}


@RequestMapping(value = "/addproduct", method = RequestMethod.GET)
public String addNewProduct(@ModelAttribute("newProduct") Product newProduct, Model model) {
	
	return "addProduct";
}

@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
productService.addProduct(newProduct);
	return "HomePage";
	
}
@RequestMapping( "/viewproducts" )
public String listProducts(@RequestParam("id") Long d, Model model) {

 productService.viewById(d);
	

	return "Viewproduct";
}

}


