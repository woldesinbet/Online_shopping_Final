package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.model.Customer;
import com.project.repository.CustomerRepository;

@Controller

public class UserController {
	@Autowired
	CustomerRepository customerService;
	
	@RequestMapping(value="/signUp",method=RequestMethod.GET)
	public String signUp(@ModelAttribute("newCustomer") Customer customer){
			return "signUp";
	}
	@RequestMapping(value="/signUp",method=RequestMethod.POST)
	public String afterSignUp(@ModelAttribute("newCustomer")  Customer customer ,RedirectAttributes redirect){
		
			customerService.save(customer);
			redirect.addFlashAttribute("users",customerService.findAll());
			return "redirect:/customers";
		}
	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public String allUser(Model model){

			model.addAttribute("users",customerService.findAll());
			return "customers";
		}
	@RequestMapping(value="/deleteCustomer/{id}",method=RequestMethod.GET)
		public String delete(@PathVariable("id") Long id){
		
			customerService.delete(id);
			return "HomePage";
		}
	
	
		
	

}
