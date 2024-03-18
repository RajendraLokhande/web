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
@Table(name="Car_Dtls")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Car_Id")
    private Integer id;
    
    private String carCompany;
    private String carModel;
    private String carColor;
    private String carType;
    private String carImg;
    private String car360;
    private String carOwner;
    private String numberPlate;
    private String regDate;
    private String insurance;
    private String insuranceValidity;
    private String  passengerCapacity;
    private String fuelType;
    private String feature;
    private String tolltalRunning;
    private Double charges;
    
    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
	private Booking booking;
    
    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private Card card;
}
