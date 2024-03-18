package com.spring.bkmycar.service;

import java.util.List;

import com.spring.bkmycar.dto.UserDto;


public interface UserService {

	public UserDto addUser(UserDto dto);
	public UserDto getUser(Integer Id);
	public List<UserDto> getAllUser();
	public UserDto updateUser(UserDto Dto, Integer Id);
	public UserDto deleteUser(Integer Id);

	
 public String authenticateUser(UserDto userDto);
		
		
		
	

}
