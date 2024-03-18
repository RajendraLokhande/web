package com.spring.bkmycar.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Booking_Dtls")
public class Booking {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Booking_Id")
	private Integer Id;
	private String pickUpLocation;
    private String dropLocation;
	private String pickUpTime;
	private String pickUpDate;
	private String dropDate;
	private Integer passangerCapacity;
	private String members;
	private Integer days;
	private String numBags;
	
	@JoinColumn(name="Car_Id")
	@OneToOne
	private Car car;
	
	
	
	
	
	
	
}

