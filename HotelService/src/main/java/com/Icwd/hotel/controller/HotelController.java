package com.Icwd.hotel.controller;

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

import com.Icwd.hotel.entities.Hotel;
import com.Icwd.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	//create 
	@PostMapping
	public ResponseEntity<Hotel> createHotel (@RequestBody Hotel hotel){
		
		Hotel hotel2 = hotelService.create(hotel);
		
		return new ResponseEntity<Hotel> (hotel2, HttpStatus.CREATED);
		
	}
	
	//get single id
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getSingle(@PathVariable String hotelId){
		
		Hotel hotel = hotelService.get(hotelId);
		
		return new ResponseEntity<Hotel> (hotel, HttpStatus.OK);	
		
	}
	
	// get all hotelId
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel(){
		
		List<Hotel> getall = hotelService.getall();
		
		return new ResponseEntity<List<Hotel>>(getall, HttpStatus.OK);
		
	}
	
}
