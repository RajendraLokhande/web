package com.springboot.Entity;

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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="BookedSeats_Dtls")
public class BookedSeats {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BookedSeats_Id")
	private Integer id;
	
	@Column(name="BookedSeats_Seats")
	private String seats;
	
	@ManyToOne
	@JoinColumn(name="booking_id")
	private Booking booking;

}
