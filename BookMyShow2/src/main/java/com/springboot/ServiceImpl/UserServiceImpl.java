package com.springboot.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.Dto.UserDto;
import com.springboot.Entity.User;
import com.springboot.Repository.UserRepository;
import com.springboot.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDto addUser(UserDto dto) {
		
		User user = this.modelMapper.map(dto, User.class);
		
		String string = this.passwordEncoder.encode(user.getPassword());
		user.setPassword(string);
		User save = userRepository.save(user);
		
		return this.modelMapper.map(save, UserDto.class);
	}

	@Override
	public UserDto getUser(Integer id) {
		User user = userRepository.findById(id).orElse(null);
		return this.modelMapper.map(user, UserDto.class);
	}

	@Override
	public List<UserDto> getAllUser() {
		List<User> list = userRepository.findAll();
		List<UserDto> list2 = list.stream().map((list1)->  modelMapper.map(list1, UserDto.class)).collect(Collectors.toList());
		return list2;
	}

	@Override
	public UserDto deleteUser(Integer id) {
		return null;
	}

	@Override
	public UserDto updateUser(UserDto dto, Integer id) {
		return null;
	}

	@Override
	public String authenticateUser(UserDto userDto) {
	User user = this.modelMapper.map(userDto, User.class);
	 Optional<User> optional = userRepository.findByEmail(user.getEmail());
		
	if (optional.isPresent()) {
		User userFromDb = optional.get();
		
		if(user.getEmail().equals(userFromDb.getEmail())) {
			if(passwordEncoder.matches(user.getPassword(), userFromDb.getPassword())) {
				return "User Authenticated";
				
			} else {
				return "Incorrect Password";
			}
		}
		
	}
		return "Invalid userEmail...!";
	}
	
}
