package com.spring.bkmycar.serviceImpl;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bkmycar.dto.BookingDto;
import com.spring.bkmycar.entity.Booking;
import com.spring.bkmycar.entity.Car;
import com.spring.bkmycar.repository.BookingRepo;
import com.spring.bkmycar.repository.CarRepo;
import com.spring.bkmycar.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepo bookingRepository;
	
	@Autowired
	private CarRepo carRepo;
	
	@Autowired
	private ModelMapper modelMapper;



	@Override
	public BookingDto addBooking(BookingDto Dto, Integer Id) {
		
		 Car car = carRepo.findById(Id).orElseThrow(null);
		 
		Booking booking = this.modelMapper.map(Dto,Booking.class);
		
		booking.setCar(car);
		
		Booking save = this.bookingRepository.save(booking);
		
	    return this.modelMapper.map(save, BookingDto.class);
			
			
	
	}


	@Override
	public BookingDto updateBooking(BookingDto Dto, Integer Id) {
		
		
		return null;
	}




	@Override
	public BookingDto getBooking(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<BookingDto> getAllBooking() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BookingDto deleteBooking(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}


