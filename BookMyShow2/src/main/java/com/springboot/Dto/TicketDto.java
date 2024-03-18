package com.springboot.Dto;

import java.util.List;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {
	
private Integer id;
	
	private String userName;
	
	private String userEmail;
	
	private String movieName;
	
	private String poster;
	
	private String time;
	
	private String thetor;
	
	private String location;
	
	private List<String> bookedSeats;
	
	private String food;
	
	private String  totalPrice;
	
	private Double price;
	
	private String cardNo;
	
	private String cardHolder;
	
	private String expDate;
	
}