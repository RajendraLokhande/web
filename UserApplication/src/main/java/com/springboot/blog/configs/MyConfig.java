package com.springboot.blog.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	public ModelMapper modelMapper() {
		return new ModelMapper();
		
	}
	
	

}
