package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomdeController {
	
	@GetMapping("/welcome")
	public ModelAndView getwelcomeMsg() {
		
		ModelAndView mav = new ModelAndView ();
		
		mav.addObject("msg", "Welcome to Spring Boot & Microservices ");
		
		mav.setViewName("welcome");
		
		return mav;
		
	}
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		
		ModelAndView mav = new ModelAndView();
			
		mav.addObject("msg", "Good Morning...!!");
		
		mav.setViewName("greet");
		
		return mav;
		
	}

	
}
