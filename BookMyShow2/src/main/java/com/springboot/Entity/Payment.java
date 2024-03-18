package com.springboot.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Payment_Dtls")
public class Payment {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Payment_Id")
	private Integer id;
	
	@Column(name="Payment_UserName")
	private String userName;
	
	@Column(name="Payment_UserEmail")
	private String userEmail;
	
	@Column(name="Payment_MovieName")
	private String movieName;
	
	@Column(name="Payment_Poster")
	private String poster;
	
	@Column(name="Payment_Location")
	private String location;
	
	@Column(name="Payment_Thetor")
	private String thetor;
	
	@Column(name="Payment_BookedSeat")
	private List<String> bookedSeats;
	
	@Column(name="Payment_Time")
	private String time;
	
	@Column(name="Payment_Price")
	private String price;
	
	@Column(name="Payment_Food")
	private String food;
	
	@Column(name="Payment_TotalPrice")
	private String totalPrice;
	
	
}

