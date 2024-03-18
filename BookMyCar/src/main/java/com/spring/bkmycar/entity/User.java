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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="User_dtls")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_id")
	private Integer id;
	
	
    private String fname;
	
	
	private String lname;
	
	
	private String dob;
	
	
	private String email;
	
	
    private String password;
	
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Card card;
	
	
	

}
