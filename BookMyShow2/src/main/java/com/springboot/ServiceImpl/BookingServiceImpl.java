package com.springboot.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Dto.BookingDto;
import com.springboot.Entity.Booking;
import com.springboot.Repository.BookingRepository;
import com.springboot.Service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	 private BookingRepository bookingRepository;
	 
	@Autowired
	 private ModelMapper modelMapper;

	@Override
	public BookingDto addBooking(BookingDto Dto) {
	 Booking booking =this.modelMapper.map(Dto, Booking.class); 
	 Booking save = bookingRepository.save(booking);
	 return this.modelMapper.map(save, BookingDto.class);
	}

	@Override
	public BookingDto getBooking(Integer Id) {
		
		Booking booking= bookingRepository.findById(Id).orElse(null);
		
		return this.modelMapper.map(booking, BookingDto.class);	
	}

	@Override
	public List<BookingDto> getAllBooking() {
		List<Booking>List= bookingRepository.findAll();
		List<BookingDto> List2 = List.stream().map((list1)-> modelMapper.map(list1, BookingDto.class)).collect(Collectors.toList());
	    
		return List2;	
	}

	@Override
	public BookingDto deleteBooking(Integer Id) {
		return null;
	}

	@Override
	public BookingDto updateBooking(BookingDto Dto, Integer Id) {
		return null;
	}	

}
