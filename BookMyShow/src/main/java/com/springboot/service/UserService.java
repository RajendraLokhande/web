package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;

@Service
public class UserService
{
	
	@Autowired
	private UserRepository useRepo;
	
	@Override
	public String RegsterUser (User user) 
	{
		useRepo.save(user);
		return "Registration successfully Completed";
		
	}  
	public List<User> getAllUser()
	{
		useRepo.findAll();
		
		return null;
	}
	
}

