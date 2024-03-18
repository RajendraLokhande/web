	package com.springboot.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Dto.CardDto;
import com.springboot.Entity.Card;
import com.springboot.Repository.CardRepository;
import com.springboot.Service.CardService;

@Service
public class CardServiceImpl implements CardService{
	
	@Autowired
	public CardRepository cardRepository;
	
	@Autowired
	public ModelMapper modelMapper;

	@Override
	public CardDto addCard(CardDto Dto) {
    Card card = this.modelMapper.map(Dto, Card.class);
		
		Card save = cardRepository.save(card);
		
		return this.modelMapper.map(save, CardDto.class);	
		
	}

	@Override
	public CardDto getCard(Integer id) {
		Card card=cardRepository.findById(id).orElse(null);
		return this.modelMapper.map(card, CardDto.class);
	
	}

	@Override
	public List<CardDto> getAllCard() {
		List<Card>List= cardRepository.findAll();
		List<CardDto> List2 = List.stream().map((list1)-> modelMapper.map(list1, CardDto.class)).collect(Collectors.toList());
	    
		return List2;		
		
		
	}

	@Override
	public CardDto update(CardDto Dto,Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardDto deleteCard(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}