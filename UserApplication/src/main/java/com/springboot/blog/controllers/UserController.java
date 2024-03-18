package com.springboot.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Dto.UserDto;
import com.springboot.Service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity <UserDto> addUser(@RequestBody UserDto Dto){
		
	    UserDto addUser = userService.addUser(Dto);
		return new ResponseEntity<UserDto>(addUser, HttpStatus.CREATED);
			
	}
	
	@GetMapping("/user{id}")
	public ResponseEntity <UserDto> getUser (@PathVariable Integer Id){
		
		UserDto user = userService.getUser(Id);
		return new ResponseEntity<UserDto>(user, HttpStatus.OK);			
		
	}
	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> getAllUser(){
		
		List<UserDto> user = userService.getAllUser();
		return new ResponseEntity<List<UserDto>>(user, HttpStatus.OK);
		
		
	}
		
}
	
	



