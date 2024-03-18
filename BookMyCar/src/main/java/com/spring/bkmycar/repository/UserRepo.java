package com.spring.bkmycar.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.bkmycar.entity.User;



public interface UserRepo  extends JpaRepository<User, Integer>{

	 Optional<User> findByEmail(String email);
		
}
	
