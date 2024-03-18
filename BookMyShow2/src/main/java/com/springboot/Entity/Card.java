package com.springboot.Entity;



import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Card_Dtls")
public class Card {

	@Id
	@Column(name="Card_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="User_CardHolderName")
	private String cardholderName;
	
	@Column(name="User_CardNo")
	private String cardno;
	
	@Column(name="User_ExpiryDate")
	private String expiryDate;
	
//	@OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
//	private Set<Ticket> ticket =new HashSet<>();
	
    
	}
  	
	
