package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WewlcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getwelcomeMsg() {
		
		ModelAndView mav = new ModelAndView ();
		
		mav.addObject("msg", "Welcome to Ashok IT...!");
		
		mav.setViewName("index");
		
		return mav;
		
	}

}
