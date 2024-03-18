package com.springboot.Dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
	
	private Integer id;
	private String userName;
	private String userEmail;
	private String movieName;
	private String poster;
	private String location;
	private String thetor;
	private List<String> bookedSeats;
	private String food;
	private String price;
	private String time;
	private String totalPrice;
	
	
	
}




