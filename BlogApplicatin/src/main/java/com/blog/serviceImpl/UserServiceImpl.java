package com.blog.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.User;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payloads.UserDto;
import com.blog.repository.UserRepo;
import com.blog.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
		

	@Override
	public UserDto addUser(UserDto userDto) {
		User user=this.DtoTouser(userDto);
		User saveUser=this.userRepo.save(user);	
		
		return this.userToDto(saveUser);
	}

	@Override
	public UserDto getUser(Integer userId) {
 		
    User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "Id", userId));
	return this.userToDto(user);
	}

	@Override
	public List<UserDto> getAllUser() {
		
	List<User> users = this.userRepo.findAll();
	
	List<UserDto> userDtos = users.stream().map(user->this.userToDto(user)).collect(Collectors.toList());
		
	return userDtos;
	}
    
	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		
    User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "Id", userId));

    user.setName(userDto.getName());
    user.setEmail(userDto.getEmail());
    user.setPassword(userDto.getPassword());
   
   
    User updateduser = this.userRepo.save(user);
    UserDto userDto1=this.userToDto(updateduser);
   
		
	return userDto1;
	}

	@Override
	public void deleteUser(Integer userId) {
		User user =this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "Id", userId));
	    this.userRepo.delete(user);
		
	}
	
    private User DtoTouser(UserDto userDto) {
    	User user = this.modelMapper.map(userDto, User.class);
    	
    	return user;
    //	User save = this.userRepo.save(user);
    	
    	
	//	return this modelMapper.map(save, userDto);
    	
    	
    	
    	
    	
 //   	User user = new User();
//    	user.setId(userDto.getId());
//    	user.setName(userDto.getName());
//    	user.setEmail(userDto.getEmail());
//    	user.setEmail(user.getEmail());
//    	user.setPassword(user.getPassword());
//    	user.setAbout(user.getAbout());
//		return user;
//    	
    }
	
    private UserDto userToDto(User user) {
    	
    	UserDto userDto = this.modelMapper.map(user, UserDto.class);
    	
		return userDto;
//    UserDto userDto = new UserDto();
//    userDto.setId(userDto.getId());
//    userDto.setName(userDto.getName());
//    userDto.setEmail(user.getEmail());
//    userDto.setPassword(userDto.getPassword());
//    userDto.setAbout(userDto.getAbout());
//    return userDto;
//	
    }
		
}