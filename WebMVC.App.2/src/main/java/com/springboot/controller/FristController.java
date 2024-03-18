package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FristController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav= new ModelAndView();
		
		mav.addObject("msg","Welcome to Spring Boot");
		
		mav.setViewName("welcome");
		
		return mav;
		
	}	
}

