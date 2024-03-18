package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Dto.CardDto;
import com.springboot.Service.CardService;

@RestController
@RequestMapping("/api")
public class CardController {

	@Autowired
	private CardService cardService;

	
	@PostMapping("/save")
	public ResponseEntity<CardDto> saveCard(@RequestBody CardDto Dto){
		
	CardDto addCard = cardService.addCard(Dto);
	return new ResponseEntity<CardDto>(addCard, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/card/{id}")
	public ResponseEntity<CardDto> saveCard(@PathVariable Integer id){
			
		CardDto card = cardService.getCard(id);
		return new ResponseEntity<CardDto>(card, HttpStatus.OK);
	}
	
	@GetMapping("/Cards")
	public ResponseEntity<List<CardDto>> getAllCard(){
		
	List <CardDto>	card=cardService.getAllCard();
	return new ResponseEntity<List<CardDto>>(card, HttpStatus.OK);		
	
   }
		
}
