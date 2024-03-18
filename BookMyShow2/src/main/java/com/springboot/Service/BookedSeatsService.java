package com.springboot.Service;

import java.util.List;

import com.springboot.Dto.BookedSeatsDto;
import com.springboot.Entity.BookedSeats;

public interface BookedSeatsService {
	
	
	public BookedSeatsDto addBookedSeats(BookedSeatsDto dto);
	
	public BookedSeatsDto getBookedSeats(Integer Id);
	
	public BookedSeatsDto updateBookedSeats(BookedSeats Dto, Integer Id);
	
	public BookedSeatsDto deleteBookedSeats(Integer Id);
	
	public List<BookedSeatsDto> getAllBookedSeats();	

}
