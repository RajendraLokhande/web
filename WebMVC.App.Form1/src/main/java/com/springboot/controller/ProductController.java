package com.springboot.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.binding.Product;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String getProductForm(Model model ) {
		Product productObj = new Product();
		model.addAttribute("book", productObj);
		return "index";

	}

	
	@PostMapping("/Product")
	public String handleFormSubmit(Product product, Model model ) {
		System.out.println(product);
		
		model .addAttribute("msg", "Product saved successfully");
		
		return "success";
	}
	
	
	
}
