package com.Icwd.user.service.services;

import java.util.List;

import com.Icwd.user.service.entities.User;

public interface UserService {
	
	// user operation
	
	// create
	 User saveUser(User user);
	 
	 
	 // gete all user
	 List<User> getAllUser();
	 
	 
	 // get single user of given userId
	 
	 User getUser(String userId);
	 
	 //TODO: delete
	 //TODO: update
	 


}
