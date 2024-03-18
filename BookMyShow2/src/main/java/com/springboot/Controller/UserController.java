package com.springboot.Controller;

import java.util.List;

//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Dto.AuthRequest;
import com.springboot.Dto.UserDto;
import com.springboot.Service.JwtService;
import com.springboot.Service.UserService;


@RestController
@RequestMapping("/api/")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/register")
	public ResponseEntity<UserDto> saveUser(@RequestBody UserDto dto){
		
		UserDto addUser = userService.addUser(dto);
		return new ResponseEntity<UserDto>(addUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{id}")
//	@PreAuthorize("hashAuthority('ROLE_USER')")
	public ResponseEntity<UserDto> getUser(@PathVariable Integer id){
		
		UserDto user = userService.getUser(id);
		return new ResponseEntity<UserDto>(user, HttpStatus.OK);
	}
	
	@GetMapping("/users")
 //   @PreAuthorize("hashAuthority('ROLE_ADMIN')")
	public ResponseEntity<List<UserDto>> getAllUser(){
		
		List<UserDto> user = userService.getAllUser();
		return new ResponseEntity<List<UserDto>>(user, HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody UserDto dto){
		
		String authenticateUser = userService.authenticateUser(dto);
		return new ResponseEntity<>(authenticateUser,HttpStatus.OK);
	}
	
	@PostMapping("/authenticate")
	public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
	//	Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken
	//			(authRequest.getFname(), authRequest.getPassword()));
	//	if(authentication.isAuthenticated()) {
		return jwtService.generateToken(authRequest.getFname());
	//	}else {
	//		throw new UsernameNotFoundException("Invalid User....!!");
		}	
	
}
	