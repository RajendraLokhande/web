package com.blog.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payloads.UserDto;
import com.blog.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	//POST-create user
	@PostMapping("/Register")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
		
	  UserDto user = this.userService.addUser(userDto);	
	  return new ResponseEntity<UserDto>(user, HttpStatus.CREATED);
	}
	
	//Put-update user
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto>getUser(@Valid @RequestBody UserDto userDto, @PathVariable("userId") Integer uid){
		
		
		UserDto updatedUser = this.userService.updateUser(userDto, uid);
		return ResponseEntity.ok(updatedUser);
	}	
	
	   // Delete - delete user
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable("userId")Integer uid){

    this.deleteUser(uid);
    return new ResponseEntity(Map.of("massage", "User Deleted Successfully"), HttpStatus.OK);
		
	 }

	// Get- user get
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
		
		return ResponseEntity.ok(this.userService.getUser(userId));
		
	}
	
	//Get- user get
	@GetMapping("/{usersId}")
	public ResponseEntity<List<UserDto>>getAllUser(){
		
	return ResponseEntity.ok(this.userService.getAllUser());
		
	}	
	
}






