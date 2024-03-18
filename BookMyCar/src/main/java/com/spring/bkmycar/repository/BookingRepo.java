package com.spring.bkmycar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.bkmycar.entity.Booking;





public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
