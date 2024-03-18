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

import com.springboot.Dto.BookingDto;
import com.springboot.Service.BookingService;

@RestController
@RequestMapping("/api")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	
	@PostMapping("/add")
	public ResponseEntity<BookingDto> saveBooking(@RequestBody BookingDto Dto){
		
	BookingDto addBooking = bookingService.addBooking(Dto);
	return new ResponseEntity<BookingDto>(addBooking, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/booking/{id}")
	public ResponseEntity<BookingDto> saveBooking(@PathVariable Integer id){
			
		BookingDto booking = bookingService.getBooking(id);
		return new ResponseEntity<BookingDto>(booking, HttpStatus.OK);
	}
	
	@GetMapping("/bookings")
	public ResponseEntity<List<BookingDto>> getAllMovie(){
		
	List <BookingDto>	booking=bookingService.getAllBooking();
	return new ResponseEntity<List<BookingDto>>(booking, HttpStatus.OK);		
	
   }
		
}
	
	

