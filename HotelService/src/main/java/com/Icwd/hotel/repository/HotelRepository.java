package com.Icwd.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Icwd.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
