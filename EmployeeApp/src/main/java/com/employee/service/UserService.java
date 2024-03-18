package com.employee.service;

import java.util.List;

import com.employee.Dto.UserDto;

public interface UserService {

	public UserDto addUser(UserDto Dto);
	public UserDto getUser(Integer Id);
	public List<UserDto> getAllUser();
	public UserDto updateUser(UserDto Dto, Integer Id);
	public UserDto deleteUser(Integer Id);
	
	
	
}