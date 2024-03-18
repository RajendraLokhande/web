package com.Icwd.hotel.service;

import java.util.List;

import com.Icwd.hotel.entities.Hotel;

public interface HotelService {
	
	//create
	
	Hotel create(Hotel hotel);	
	
	//get single
	Hotel get(String id);
	
	
	//get all
	List<Hotel> getall();
	
	
	

}
