package com.spring.bkmycar.dto;

import com.spring.bkmycar.entity.Car;
import com.spring.bkmycar.entity.Driver;
import com.spring.bkmycar.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {

	
	 
		private Integer Id;
		private String cardNumber;
		private String name;
		private String cvv;
		private String  expDate;
		
		private User user;
		private Driver driver;
		private Car car;
		
	
		
}

