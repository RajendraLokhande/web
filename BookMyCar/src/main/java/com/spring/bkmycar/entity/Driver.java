package com.spring.bkmycar.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Driver {
	
	
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="Driver_Id")
	private Integer id;
   
   
	private String driverName;
	
   
   private String driverImage;
   
   
	private String driverExpirience;
   
   
	private long driverMob;
   
   
	private String food;
   
   
	private String drink;
   
   
	private String smoke;
   
   
	private Double charges;
   
   
	private String availability;
   
   @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
   private Card card;

}

