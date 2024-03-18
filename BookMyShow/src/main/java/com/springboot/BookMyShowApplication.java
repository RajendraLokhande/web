package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ConfigurableApplicationContext;


import com.springboot.repository.UserRepository;

@SpringBootApplication
public class BookMyShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
		ConfigurableApplicationContext	context=SpringApplication.run(Application.class, args);
		
		
		UserRepository repository =context.getBean(UserRepository.class);
		
		User u1= new User ();
		
	repository.save(u1);
		
		}
		
	}
	
