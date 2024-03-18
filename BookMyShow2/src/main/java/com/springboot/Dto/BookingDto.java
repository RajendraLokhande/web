package com.springboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
	
	private Integer id;
	
	private String food;
	
	private String location;
	
	private String price;
	
	private String thetor;
	
	private String time;
	
	private Double total_price;
	
	
}