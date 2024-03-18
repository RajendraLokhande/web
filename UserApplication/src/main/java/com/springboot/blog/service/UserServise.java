package com.springboot.blog.service;

import java.util.List;

import com.springboot.blog.payloads.UserDto;

public interface UserServise {
	
	
	public UserDto addUser(UserDto Dto);
	public UserDto getUser(Integer Id);
	public List<UserDto> getAllUser();
	public UserDto updateUser(UserDto Dto,Integer Id);
	public UserDto deleteUser(Integer Id);
	
	
	
	

}
