package com.spring.bkmycar.serviceImpl;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bkmycar.dto.CardDto;
import com.spring.bkmycar.entity.Car;
import com.spring.bkmycar.entity.Card;
import com.spring.bkmycar.entity.Driver;
import com.spring.bkmycar.entity.User;
import com.spring.bkmycar.repository.CarRepo;
import com.spring.bkmycar.repository.CardRepo;
import com.spring.bkmycar.repository.DriverRepo;
import com.spring.bkmycar.repository.UserRepo;
import com.spring.bkmycar.service.CardService;

@Service
public class CardServiceImpl implements CardService{
	
	@Autowired
	private CardRepo cardRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private DriverRepo driverRepo;
	
	@Autowired 
	private CarRepo carRepo;

	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public CardDto createCard(CardDto Dto, Integer UserId,Integer DriverId, Integer CarId) {
		Car car = this.carRepo.findById(CarId).orElseThrow();
		Driver driver = this.driverRepo.findById(DriverId).orElseThrow();
		User user = this.userRepo.findById(UserId).orElseThrow();
		 
		
		Card card=this.modelMapper.map(Dto, Card.class);
		
		card.setCar(car);
		card.setDriver(driver);
		card.setUser(user);
		
		Card save = cardRepo.save(card);
		
		return this.modelMapper.map(save, CardDto.class);
	
	}

	

}
	
	






