package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")

public class HomeController {
	public String Front1(Model model){
		return "HomePage";
	}


}
