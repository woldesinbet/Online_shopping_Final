package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.project.model.Category;

import com.project.service.CategoryService;


@Controller
public class CategoryController {
	@Autowired 
	private CategoryService categoryService;




@RequestMapping(value = "/addcategory", method = RequestMethod.GET)
public String addNewProduct(@ModelAttribute("newCategory") Category newCategory, Model model) {
	
	return "addcategory";
}

@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
public String processAddNewProductForm(@ModelAttribute("newCategory") Category newCategory) {
	categoryService.addCategory(newCategory);
	return "HomePage";
	
}
@RequestMapping( "/viewcategory" )
public String viewCategory(Model model) {
	
	model.addAttribute("category", categoryService.viewCategory());
	return "category";

	
	}

}
