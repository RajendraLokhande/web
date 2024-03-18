package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	public String RegisterUser(@RequestBody User user) {
		
		return userService.RegsterUser(user);
		
	}
	public List<User> getAllUsers(){
	 return userService.getAllUser();
	
}
}