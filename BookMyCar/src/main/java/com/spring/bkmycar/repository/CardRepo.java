package com.spring.bkmycar.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.bkmycar.entity.Card;



public interface CardRepo extends JpaRepository<Card, Integer>{

	
	
}
