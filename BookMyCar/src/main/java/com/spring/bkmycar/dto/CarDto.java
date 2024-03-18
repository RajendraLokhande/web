package com.spring.bkmycar.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
	
private Integer id;
private String carCompany;
private String carModel;
private String carColor;
private String carType;
private String carImg;
private String car360;
private String carOwner;
private String numberPlate;
private String regDate;
private String insurance;
private String insuranceValidity;
private String  passengerCapacity;
private String fuelType;
private String feature;
private String tolltalRunning;
private Double charges;


}

