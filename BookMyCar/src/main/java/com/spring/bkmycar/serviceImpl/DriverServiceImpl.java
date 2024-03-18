package com.spring.bkmycar.serviceImpl;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bkmycar.dto.DriverDto;
import com.spring.bkmycar.entity.Driver;
import com.spring.bkmycar.repository.DriverRepo;
import com.spring.bkmycar.service.DriverService;



@Service
public class DriverServiceImpl implements DriverService{
	
	@Autowired
	private DriverRepo driverRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	

	@Override
	public DriverDto addDriver(DriverDto Dto) {
		Driver driver = this.modelMapper.map(Dto, Driver.class);
		Driver driver2 = driverRepository.save(driver);
		return this.modelMapper.map(driver2, DriverDto.class);
	}

	@Override
	public DriverDto getDriver(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DriverDto> getAllDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverDto updateDriver(DriverDto Dto, Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverDto deleteDriver(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

}

