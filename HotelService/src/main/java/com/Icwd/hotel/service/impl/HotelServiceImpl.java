package com.Icwd.hotel.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Icwd.hotel.entities.Hotel;
import com.Icwd.hotel.exceptions.ResourceNotFoundException;
import com.Icwd.hotel.repository.HotelRepository;
import com.Icwd.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
		
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel get(String id) {
		
		
		return hotelRepository.findById(id).orElseThrow(()-> 
		new ResourceNotFoundException ("hotel with given id not found !!"));
	}

	@Override
	public List<Hotel> getall() {
		
		
		return hotelRepository.findAll();
	}

	
}
