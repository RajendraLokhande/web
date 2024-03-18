package com.springboot.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Dto.CardDto;
import com.springboot.Dto.MyBookingDto;
import com.springboot.Entity.MyBooking;
import com.springboot.Repository.MyBookingRepository;
import com.springboot.Service.MyBookingService;


@Service
public class MyBookingServiceImpl implements MyBookingService{

	@Autowired
	private MyBookingRepository mybookingRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public MyBookingDto addMyBooking(MyBookingDto Dto) {
		
	
	MyBooking mybooking =this.modelMapper.map(Dto, MyBooking.class);
	MyBooking save=mybookingRepository.save(mybooking);
	
	return this.modelMapper.map(save, MyBookingDto.class);
	}

	@Override
	public MyBookingDto getMyBooking(Integer Id) {
		
	MyBooking mybooking=mybookingRepository.findById(Id).orElse(null);
    return this.modelMapper.map(mybooking, MyBookingDto.class);	
		

	}

	@Override
	public List<MyBookingDto> getAllMyBooking() {
		
	List<MyBooking>List=mybookingRepository.findAll();
	
	List<MyBookingDto> List2 = List.stream().map((list1)-> modelMapper.map(list1, MyBookingDto.class)).collect(Collectors.toList());
    
	return List2;			
	}

	@Override
	public MyBookingDto updateMyBooking(MyBookingDto Dto, Integer Id) {
		return null;
	}

	@Override
	public MyBookingDto deleteMyBooking(Integer Id) {
		return null;
	}

}
