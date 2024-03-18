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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Dto.MyBookingDto;
import com.springboot.Service.MyBookingService;

@RestController
@RequestMapping("/api/")
public class MyBookingController {
	
	@Autowired
	private MyBookingService mybookingService;
	
	@PostMapping("/addMyBooking")
	
	public ResponseEntity<MyBookingDto> saveMyBooking(@RequestBody MyBookingDto Dto){
	
	MyBookingDto addMyBooking = mybookingService.addMyBooking(Dto);
	return new ResponseEntity<MyBookingDto>(addMyBooking, HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/getMyBooking{id}")
	
	public ResponseEntity<MyBookingDto> saveMyBooking(@PathVariable Integer id){
		
		MyBookingDto mybooking = mybookingService.getMyBooking(id);
		return new ResponseEntity<MyBookingDto> (mybooking, HttpStatus.OK);
	}
	
	
	@GetMapping("/MyBookings")
	
	public ResponseEntity<List<MyBookingDto>>getAllMyBooking(){
		List <MyBookingDto> mybooking= mybookingService.getAllMyBooking();
		return new ResponseEntity<List<MyBookingDto>> (mybooking, HttpStatus.OK);
			
	}

}




