package com.spring.bkmycar.service;



import java.util.List;

import com.spring.bkmycar.dto.CarDto;





public interface CarService {
	
	
	public CarDto createCar (CarDto Dto);
	public CarDto getCar (Integer Id);
	public List<CarDto> getAllCar ();
	public CarDto updateCar (CarDto Dto,Integer Id);
	public CarDto deleteCar (Integer Id);
	
	
	
	
}
