package com.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.Ticket;

public interface TicketRepository extends JpaRepository <Ticket, Integer> {
	
	
	List<Ticket> findByUserEmail(String userEmail);


}
