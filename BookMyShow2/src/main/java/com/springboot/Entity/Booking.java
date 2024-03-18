package com.springboot.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Booking_Dtls")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Booking_Id")
	private Integer id;
	
	@Column(name="Booking_Food")
	private String food;
	
	@Column(name="Booking_Location")
	private String location;
	
	@Column(name="Booking_Price")
	private String price;
	
	@Column(name="Booking_Thetor")
	private String thetor;
	
	@Column(name="Booking_Time")
	private String time;
	
	@Column(name="Booking_Total_Price")
	private Double total_price;

	@ManyToOne
	@JoinColumn(name="User_Id")
    private User user;
	
	@ManyToOne
	@JoinColumn(name= "movie_id")
	private Movie movie;
	
	@OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
	private Set<BookedSeats> bookedSeats = new HashSet<>();
	
	
//	@OneToMany(mappedBy = "boking", cascade = CascadeType.ALL)
//	private Set<Ticket> ticket = new HashSet<>();
}


