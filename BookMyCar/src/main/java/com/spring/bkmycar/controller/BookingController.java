package com.spring.bkmycar.controller;

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

import com.spring.bkmycar.dto.BookingDto;
import com.spring.bkmycar.service.BookingService;

@RestController
@RequestMapping("/api/")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/addBooking")
	public ResponseEntity<BookingDto>addBooking(@RequestBody BookingDto Dto, @PathVariable Integer Id) {
		
	 
		BookingDto booking = bookingService.addBooking(Dto, Id);
		
		return new ResponseEntity<BookingDto>(booking,  HttpStatus.CREATED);
			
	}
	
	@GetMapping("/getAllBooking")
	public ResponseEntity<List<BookingDto>>getAllBooking(){
		
		List<BookingDto> allBooking = bookingService.getAllBooking();
		return new ResponseEntity<List<BookingDto>>(allBooking, HttpStatus.OK);
		
	}


}
