package com.springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.Service.UserService;

// ch.qos.logback.core.Context;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
	ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	

	UserService userService = context.getBean(UserService.class);
	
	userService.saveUser();
	
	}

}
 