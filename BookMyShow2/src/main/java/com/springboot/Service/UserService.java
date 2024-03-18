package com.springboot.Service;

import java.util.List;

import com.springboot.Dto.UserDto;

public interface UserService {
	
	public UserDto addUser(UserDto dto);
	public UserDto getUser(Integer id);
	public List<UserDto> getAllUser();
	public UserDto deleteUser(Integer id);
	public UserDto updateUser(UserDto dto,Integer id);
	
	public String authenticateUser(UserDto userDto);

}
