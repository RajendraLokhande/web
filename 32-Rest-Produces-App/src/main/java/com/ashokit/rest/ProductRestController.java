package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.Product;

@RestController
public class ProductRestController {
	
	@GetMapping("/product")
	public ResponseEntity<Product> getProduct(){
		
		Product productObject = new Product();
		
		productObject.setPid(101);
		productObject.setPname("Mouse");
		productObject.setPrice(450.00);	
		
		return new ResponseEntity<Product>(productObject, HttpStatus.OK);
		
		
	}
	
	
	

}
