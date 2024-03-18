package com.spring.bkmycar.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Card_Dtls")
public class Card {
	
    @Id
    @Column(name="Card_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
	private String cardNumber;
	private String name;
	private String cvv;
	private String expDate;
	
	@OneToOne
	@JoinColumn(name="User_Id")
	private User user;
	
	@OneToOne
	@JoinColumn(name="Driver_Id")
	private Driver driver;
	
	@OneToOne
	@JoinColumn(name="Car_Id")
	private Car car;

	public void setUser(com.spring.bkmycar.entity.User user2) {
		// TODO Auto-generated method stub
		
	}
	

		
	
		
	


}


