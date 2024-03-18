package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.binding.Book;

@Controller
public class BookController {

	@GetMapping("/")
	public String displayForm(Model model) {
		
	Book bookObj = new Book();	
	model.addAttribute("book",bookObj);
	return "index";
		
	}
	
	@GetMapping("/book")
   public String saveBook(Book book, Model model) {
	 System.out.println(book);
	 model.addAttribute("msg","Book Save Successfully..book.!!!");
	return "success";
 }
	
}