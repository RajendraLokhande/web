package com.spring.bkmycar.serviceImpl;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.bkmycar.dto.UserDto;
import com.spring.bkmycar.entity.User;
import com.spring.bkmycar.repository.UserRepo;
import com.spring.bkmycar.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDto addUser(UserDto Dto) {
		
		  User user = this.modelMapper.map(Dto, User.class);
		String string = this.passwordEncoder.encode(user.getPassword());
		user.setPassword(string);
	
		User save = this.userRepo.save(user);
		
		
		return this.modelMapper.map(save, UserDto.class);
	}

	@Override
	public UserDto getUser(Integer Id) {
		User user = userRepo.findById(Id).orElseThrow();
		return this.modelMapper.map(user, UserDto.class);
	}
	

	@Override
	public List<UserDto> getAllUser() {
		
		List<User> list = userRepo.findAll();
		List<UserDto> list2 = list.stream().map((list1)->  modelMapper.map(list1, UserDto.class)).collect(Collectors.toList());
		return list2;
		
		
	}

	@Override
	public UserDto updateUser(UserDto Dto, Integer Id) {
		return null;
	}

	@Override
	public UserDto deleteUser(Integer Id) {
		return null;
	}

	@Override
	public String authenticateUser(UserDto userDto) {


		User user = this.modelMapper.map(userDto, User.class);
	   Optional<User> optional = this.userRepo.findByEmail(user.getEmail());
	   
	   if (optional.isPresent()) {
			User userFromdb = optional.get();
			if (userFromdb.getEmail().equals(user.getEmail())) {
				if (user.getPassword().equals(userFromdb.getPassword())) {
					return "Login successfully";
				} else {
					return "Password is incorrect";
				}
			}

			return "Email not matched";
		}

		return "Email is Incorrect..Please check";
	
	}
		
		
}


