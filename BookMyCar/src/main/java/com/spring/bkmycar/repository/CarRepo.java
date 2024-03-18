package com.spring.bkmycar.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.bkmycar.entity.Car;



public interface CarRepo extends JpaRepository<Car, Integer>{
	
	

}

