package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.binding.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {
		
		// setting data to binding obj
		Book bookObj = new Book(101,"String", 450.00);
		
		//adding data to model obj to send to UI 
		model.addAttribute("book",bookObj);
		
		
		// retun view name
		return "book";
	
	
}
}