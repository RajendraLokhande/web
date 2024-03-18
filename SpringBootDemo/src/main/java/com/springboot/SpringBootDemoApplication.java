package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	=SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println(context.getClass().getName());		
		
		System.out.println("Beans Loaded :: "+ context.getBeanDefinitionCount());
		
	}

}
