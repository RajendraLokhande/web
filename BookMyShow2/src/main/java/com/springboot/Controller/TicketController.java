package com.springboot.Controller;

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

//import com.springboot.Dto.MovieDto;
import com.springboot.Dto.TicketDto;
import com.springboot.Service.TicketService;

@RestController
@RequestMapping("/api/")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;

	@PostMapping("/addticket")
	public ResponseEntity<TicketDto> saveTicket(@RequestBody TicketDto Dto){
	
	TicketDto addTicket = ticketService.addTicket(Dto);	
	return new ResponseEntity<TicketDto>(addTicket, HttpStatus.CREATED);
	}	
	
	@GetMapping("/ticket/{id}")
	public ResponseEntity<TicketDto> saveTicket(@PathVariable Integer id){
			
		TicketDto ticket = ticketService.getTicket(id);
		return new ResponseEntity<TicketDto>(ticket, HttpStatus.OK);
	}
	
	@GetMapping("/Tickets")
	public ResponseEntity<List<TicketDto>> getAllTicket(){
		
	List <TicketDto>ticket=ticketService.getAllTicket();
	return new ResponseEntity<List<TicketDto>>(ticket, HttpStatus.OK);		
	
	
	}
	
	@GetMapping("/abc/{userEmail}")
	public ResponseEntity<List<TicketDto>> getTicket(@PathVariable String userEmail){
		
		List<TicketDto> ticketDetailsByEmail = ticketService.getTicketDetailsByEmail(userEmail);
		return new ResponseEntity<List<TicketDto>>(ticketDetailsByEmail, HttpStatus.OK);
	}
	
	
	
	
}	
	





