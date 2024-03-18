package com.springboot;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext	context=SpringApplication.run(Application.class, args);
	
	
	UserRepository repository =context.getBean(UserRepository.class);
	
	User u1= new User (101, "Ramu", "Male", "25", "India");
	
//	repository.save(u1);
	
	User u2= new User (102, "Raju", "Male", "26", "India");
	User u3= new User (103, "Jhon", "Male", "30", "USA");
	User u4= new User (104, "Smith", "Male", "32", "Canada");
	
	
//	repository.saveAll(Arrays.asList(u2,u3,u4));
	
/*	Optional<User>findById = repository.findById(103);
	 if(fundById.isPresent()) {
		 System.out.println(findById.get());
	 }*/
	
/*	Iterable<User>allById=repository.findAllById(Arrays.asList(101,102,103));
	allById.forEach(user ->{
		System.out.println(user);
	});*/
	
/*	long  count = repository.count();
	System.out.println("Total records in table :: "+ count);
	
	boolean existtsById= repository.existsById(120);
	
	System.out.println("Record presence with id - 120 :: " + existsById); */
	

	repository.deleteById(104);
	
	
	
	}
	
}

	