package com.spring.bkmycar.serviceImpl;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bkmycar.dto.CarDto;
import com.spring.bkmycar.entity.Car;
import com.spring.bkmycar.repository.CarRepo;
import com.spring.bkmycar.service.CarService;


@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepo carRepo;
	
	@Autowired
	private ModelMapper modelMapper; 

	
	@Override
	public CarDto createCar(CarDto Dto) {
		
		Car car = this.modelMapper.map(Dto, Car.class);
		
		Car save = this.carRepo.save(car);
		
		return this.modelMapper.map(save, CarDto.class);
	}




	@Override
	public CarDto getCar(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<CarDto> getAllCar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CarDto updateCar(CarDto Dto, Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CarDto deleteCar(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}
}

