package com.spring.bkmycar.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bkmycar.dto.CardDto;
import com.spring.bkmycar.service.CardService;
//import com.springboot.Dto.CardDto;

@RestController
@RequestMapping("/api/")
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@PostMapping("/RegisterCard/{userId}/{driverId}/{carId}")
	public ResponseEntity<CardDto> createCard(@RequestBody CardDto cardDto, @PathVariable Integer userId,@PathVariable Integer driverId,@PathVariable Integer carId){
		
	      CardDto createCard = this.cardService.createCard(cardDto, userId, driverId, carId);
	      
		return new ResponseEntity<CardDto>(createCard, HttpStatus.CREATED); 	
	}
}



