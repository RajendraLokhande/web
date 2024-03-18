package com.Icwd.rating.controller;

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

import com.Icwd.rating.entities.Rating;
import com.Icwd.rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	// create
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		
		Rating rating2 = ratingService.create(rating);
		return new ResponseEntity<Rating>(rating2, HttpStatus.CREATED);
		
	}
	
	//get all
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings(){
      
		return ResponseEntity.ok(ratingService.getRatings());
		
	}
	// get all
	@GetMapping("/users{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
		
	}
	
   // get all
	@GetMapping("/hotels{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getRatingByhotel(hotelId));
		
	}
	
	
	
	
	
	
}
