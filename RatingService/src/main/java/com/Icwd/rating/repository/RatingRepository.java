package com.Icwd.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Icwd.rating.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {

	
	// custpm finder methods
	
	List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
