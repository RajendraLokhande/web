package com.springboot.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Ticket_Dtls")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Ticket_Id")
	private Integer id;
	
	@Column(name="Ticket_Name")
	private String userName;
	
	@Column(name="Ticket_Email")
	private String userEmail;
	
	@Column(name="Ticket_MovieName")
	private String movieName;
	
	@Column(name="Ticket_Poster")
	private String poster;
	
	@Column(name="Ticket_Time")
	private String time;
	
	@Column(name="Ticket_Thetor")
	private String thetor;
	
	@Column(name="Ticket_Location")
	private String location;
	
	@Column(name="Ticket_BookedSeats")
	private List<String> bookedSeats;
	
	@Column(name="Ticket_Food")
	private String food;
	
	@Column(name="Ticket_TotalPrice")
	private String  totalPrice;
	
	@Column(name="Ticket_Price")
	private Double price;
	
	@Column(name="Ticket_CardNo")
	private String cardNo;
	
	@Column(name="Ticket_CardHolder")
	private String cardHolder;
	
	@Column(name="Ticket_ExpDate")
	private String expDate;

//	@ManyToOne
//	@JoinColumn(name= "user_id")
//	private User user;
	
//	@ManyToOne
//	@JoinColumn(name = "movie_id")
//	private Movie movie;
	
	
//	@ManyToOne
//	@JoinColumn(name= "Card_id")
//	private Card card;

//	@ManyToOne
//	@JoinColumn(name = "booking_id")
//	private Booking booking;

}
