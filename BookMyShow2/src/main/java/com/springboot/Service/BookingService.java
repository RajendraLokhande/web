package com.springboot.Service;

import java.util.List;

import com.springboot.Dto.BookingDto;

public interface BookingService {
	
	
	public BookingDto addBooking(BookingDto Dto);
	public BookingDto getBooking(Integer Id);
	public List <BookingDto> getAllBooking();
	public BookingDto deleteBooking(Integer Id);
	public BookingDto updateBooking(BookingDto Dto,Integer Id);
	
	
	
	
	
	

}
