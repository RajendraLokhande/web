package com.spring.bkmycar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bkmycar.dto.UserDto;
import com.spring.bkmycar.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/RegisterUser")
	public ResponseEntity<UserDto> saveUser(@RequestBody UserDto Dto){
		
		UserDto user = userService.addUser(Dto);
				
		
		return new ResponseEntity<UserDto>(user, HttpStatus.CREATED); 	
	}
	@GetMapping("/getUser")
   public ResponseEntity<UserDto> getUser(@RequestBody Integer Id){
	UserDto user = userService.getUser(Id);
	   
	return new ResponseEntity<UserDto>(user,HttpStatus.OK);
	  
   }
   
	
   
}
