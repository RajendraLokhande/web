package com.springboot.Service;

import java.util.List;

import com.springboot.Dto.CardDto;

public interface CardService {
	
	
	public CardDto addCard(CardDto Dto);
	public CardDto getCard(Integer id);
	public List<CardDto>getAllCard();
	public CardDto update(CardDto Dto,Integer id );
	public CardDto deleteCard(Integer id);	

}
