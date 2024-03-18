package com.Icwd.rating.service;

import java.util.List;

import com.Icwd.rating.entities.Rating;

public interface RatingService {
	

	//create
    Rating create (Rating rating);
		
    
	//get all ratings
	List<Rating> getRatings();
	
	
	//get all by UserId
	List<Rating> getRatingByUserId(String userId);
		
	
	//get all by hotelId
	List<Rating> getRatingByhotel(String hotelId);

	
	
}
