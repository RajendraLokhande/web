package com.student.controller;

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

import com.student.Dto.UserDto;
import com.student.service.UserService;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/Register")
	public ResponseEntity<UserDto>addUser(@RequestBody UserDto Dto){
		
		UserDto user = userService.addUser(Dto);	
		return new ResponseEntity<UserDto>(user, HttpStatus.CREATED);
		
	}
	@GetMapping("/getUser")
   public ResponseEntity<UserDto>getUser(@PathVariable Integer Id) {
	   
	UserDto user = userService.getUser(Id);   
	return new ResponseEntity<UserDto>(user, HttpStatus.OK);
} 
	@GetMapping("/getAllUser")
   public ResponseEntity<List<UserDto>>getAllUser() {
	   
	List<UserDto> list = userService.getAllUser();   
	return new ResponseEntity<List<UserDto>>(list, HttpStatus.OK);
  }
   
   
}
