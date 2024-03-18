package com.spring.bkmycar.service;



import java.util.List;

import com.spring.bkmycar.dto.BookingDto;


public interface BookingService {
	
	public BookingDto addBooking(BookingDto Dto, Integer Id);
	public BookingDto getBooking(Integer Id);
	public List <BookingDto>getAllBooking();
	public BookingDto updateBooking(BookingDto Dto, Integer Id);
	public BookingDto deleteBooking( Integer Id);
	
	
	
	

}

