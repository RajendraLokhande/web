package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {	
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		
		String msgTxt = "Good Morning..";
		
		model.addAttribute("msg", msgTxt);
		
		return "greet";   // returning view name
		
	}

}
