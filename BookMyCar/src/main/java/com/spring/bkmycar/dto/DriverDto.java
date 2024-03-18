package com.spring.bkmycar.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
	
	
	private Integer id;
	private String driverName;
	private String driverImage;
	private String driverExpirience;
	private long driverMob;
	private String food;
	private String drink;
	private String smoke;
	private Double charges;
	private String availability;

	
}

