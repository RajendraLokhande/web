package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.MyBooking;

public interface MyBookingRepository extends JpaRepository<MyBooking, Integer>{

	
	
}
