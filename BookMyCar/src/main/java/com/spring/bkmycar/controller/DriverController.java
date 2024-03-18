package com.spring.bkmycar.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bkmycar.dto.DriverDto;
import com.spring.bkmycar.service.DriverService;


@RestController
@RequestMapping("/api/")
public class DriverController {
	
	@Autowired
	private DriverService driverService;
	
	
	@PostMapping("/RegisterDriver")
	public ResponseEntity<DriverDto> saveDriver(@RequestBody DriverDto Dto){
		
		DriverDto driver = driverService.addDriver(Dto);
		
		return new ResponseEntity<DriverDto>(driver, HttpStatus.CREATED); 	
	}
	@GetMapping("/getDriver")
   public ResponseEntity<DriverDto> getDriver(@RequestBody Integer Id){
	   DriverDto driver = driverService.getDriver(Id);
	   
	return new ResponseEntity<DriverDto>(driver,HttpStatus.OK);
	  

}

}