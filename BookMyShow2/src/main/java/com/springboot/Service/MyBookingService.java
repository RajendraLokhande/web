package com.springboot.Service;

import java.util.List;

import com.springboot.Dto.MyBookingDto;

public interface MyBookingService {
	
	public MyBookingDto addMyBooking(MyBookingDto Dto);
	public MyBookingDto getMyBooking(Integer Id);
	public List<MyBookingDto>getAllMyBooking();
	public MyBookingDto updateMyBooking(MyBookingDto Dto, Integer Id);
	public MyBookingDto deleteMyBooking(Integer Id);	

}
