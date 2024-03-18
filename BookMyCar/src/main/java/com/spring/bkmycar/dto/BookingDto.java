package com.spring.bkmycar.dto;



import com.spring.bkmycar.entity.Car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
	
	private Integer Id;
	private String pickUpLocation;
    private String dropLocation;
	private String pickUpTime;
	private String pickUpDate;
	private String dropDate;
	private Integer passangerCapacity;
	private String members;
	private Integer days;
	private String numBags;
	
	
	private Car car;
	

}

