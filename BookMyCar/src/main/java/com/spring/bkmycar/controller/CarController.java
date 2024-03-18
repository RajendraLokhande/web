package com.spring.bkmycar.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bkmycar.dto.CarDto;
import com.spring.bkmycar.service.CarService;
import com.spring.bkmycar.service.CardService;

@RestController
@RequestMapping("/api/")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@PostMapping("/RegisterCar")
	public ResponseEntity<CarDto> addCar(@RequestBody CarDto Dto){
		
	      CarDto createCar = carService.createCar(Dto);
	    		  
	      
		return new ResponseEntity<CarDto>(createCar, HttpStatus.CREATED); 	
	}
//	@GetMapping("/getCar")
//   public ResponseEntity<CarDto> getCar(@RequestBody Integer Id){
//		CarDto car= carService.getCar(Id);
//	   
//  return new ResponseEntity<CarDto>(car, HttpStatus.OK);
//  
//	}  

	
}


