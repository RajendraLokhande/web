package com.spring.bkmycar.service;

import java.util.List;

import com.spring.bkmycar.dto.DriverDto;


public interface DriverService {
		
		public DriverDto addDriver(DriverDto Dto);
		public DriverDto getDriver(Integer Id);
		public List<DriverDto> getAllDriver();
		public DriverDto updateDriver(DriverDto Dto, Integer Id);
		public DriverDto deleteDriver(Integer Id);


	}



