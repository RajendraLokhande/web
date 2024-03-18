package com.springboot.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Dto.BookedSeatsDto;
//import com.springboot.Dto.BookingDto;
//import com.springboot.Dto.CardDto;
import com.springboot.Entity.BookedSeats;
//import com.springboot.Entity.Booking;
//import com.springboot.Entity.Card;
import com.springboot.Repository.BookedSeatsRepository;
import com.springboot.Service.BookedSeatsService;

@Service
public class BookedSeatsServiceImpl implements BookedSeatsService{
	
	@Autowired
	private BookedSeatsRepository bookedSeatsRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public BookedSeatsDto addBookedSeats(BookedSeatsDto dto) {
		BookedSeats bookedSeats = this.modelMapper.map(dto, BookedSeats.class); 
		BookedSeats save = bookedSeatsRepository.save(bookedSeats);
		 return this.modelMapper.map(save, BookedSeatsDto.class);
	}
	
		@Override
	   public BookedSeatsDto getBookedSeats(Integer Id) {
			
			BookedSeats bookingSeats= bookedSeatsRepository.findById(Id).orElse(null);
			
			return this.modelMapper.map(bookingSeats, BookedSeatsDto.class);	
		
		}

	@Override
	public List<BookedSeatsDto> getAllBookedSeats() {
		List<BookedSeats>List= bookedSeatsRepository.findAll();
		List<BookedSeatsDto> List2 = List.stream().map((list1)-> modelMapper.map(list1, BookedSeatsDto.class)).collect(Collectors.toList());
	    
		return List2;
	}

	@Override
	public BookedSeatsDto updateBookedSeats(BookedSeats Dto, Integer Id) {
		return null;
	}

	@Override
	public BookedSeatsDto deleteBookedSeats(Integer Id) {
		return null;
	}
}
