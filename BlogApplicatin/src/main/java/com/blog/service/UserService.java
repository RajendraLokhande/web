package com.blog.service;

import java.util.List;

import com.blog.payloads.UserDto;

public interface UserService {
	
	
	UserDto addUser(UserDto userDto);
	UserDto getUser(Integer Id);
	List<UserDto> getAllUser();
	UserDto updateUser(UserDto userDto, Integer Id);

	void deleteUser(Integer userId);

}
