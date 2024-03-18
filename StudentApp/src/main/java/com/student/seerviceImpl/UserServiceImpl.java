package com.student.seerviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Dto.UserDto;
import com.student.entity.User;
import com.student.repository.UserRepository;
import com.student.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	

	@Override
	public UserDto addUser(UserDto Dto) {
		 User user = this.modelMapper.map(Dto, User.class);
		 User save = this.userRepository.save(user);
		
		return modelMapper.map(save, UserDto.class);
	}

	@Override
	public UserDto getUser(Integer Id) {
		User user = this.userRepository.findById(Id).orElseThrow();
		
		return modelMapper.map(user, UserDto.class);
	}

	@Override
	public List<UserDto> getAllUser() {
		
		List<User> list = userRepository.findAllById(null);
		List<UserDto> list2 = list.stream().map((list1)->modelMapper.map(list1, UserDto.class)).collect(Collectors.toList());
		
		return list2;

	}

	@Override
	public UserDto updateUser(UserDto Dto, Integer Id) {
		
		
		return null;
	}

	@Override
	public UserDto deleteUser(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

}