package com.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	
	 
	
}
