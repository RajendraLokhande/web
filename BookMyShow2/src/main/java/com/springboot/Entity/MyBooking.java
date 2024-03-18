package com.springboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="MyBooking_Dtls")
public class MyBooking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MyBooking_Id")
	private Integer id;

	@Column(name="MyBooking_Email")
	private String email;
	
	@OneToOne
	@JoinColumn(name="MyBooking_id")
	private Booking booking;
	
	@ManyToOne
	@JoinColumn(name = "User_Dtls")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "fk_booking_id")
	private Booking mainbooking;
	
//	@Column(name="MyBooking_Booking")
//	private Booking booking;
//	
//	@Column(name="MyBooking_User")
//	private User user;
//	
	
}
