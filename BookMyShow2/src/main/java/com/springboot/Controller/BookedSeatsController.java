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

import com.springboot.Dto.BookedSeatsDto;
import com.springboot.Repository.BookedSeatsRepository;
//import com.springboot.Dto.CardDto;
import com.springboot.Service.BookedSeatsService;

@RestController
@RequestMapping("/api")
public class BookedSeatsController {
	
	@Autowired
	private BookedSeatsService bookedSeatsService;

	@PostMapping("/saveBookedSeats")
	public ResponseEntity<BookedSeatsDto> saveBookedSeats(@RequestBody BookedSeatsDto Dto){
		
	 BookedSeatsDto addBookedSeats = bookedSeatsService.addBookedSeats(Dto);
	return new ResponseEntity<BookedSeatsDto>(addBookedSeats, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/bookedseats/{id}")
	public ResponseEntity<BookedSeatsDto> saveBookedSeats(@PathVariable Integer id){
			
		BookedSeatsDto bookedseats = bookedSeatsService.getBookedSeats(id);
		return new ResponseEntity<BookedSeatsDto>(bookedseats, HttpStatus.OK);
	}
	
	@GetMapping("/BookedSeats")
	public ResponseEntity<List<BookedSeatsDto>> getAllBookedSeats(){
		
	List <BookedSeatsDto>	bookedseats=bookedSeatsService.getAllBookedSeats();
	return new ResponseEntity<List<BookedSeatsDto>>(bookedseats, HttpStatus.OK);		
	
   }
		
}

