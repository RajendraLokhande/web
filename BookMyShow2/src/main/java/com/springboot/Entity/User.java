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
@Table(name="User-Dtls")
public class User {
	
	@Id
	@Column(name="User-Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="User-FName")
	private String fname;
	@Column(name="User-Email")
	private String email;
	@Column(name="User-Dob")
	private String dob;
	@Column(name="User-Password")
	private String password;
	@Column(name="User-LName")
	private String lName;
	
	@Column(name="User_Roles")
	private String roles;
	
	@OneToMany(mappedBy= "user", cascade = CascadeType.ALL)
	private Set<Booking> booking = new HashSet<Booking>();
	
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//	private Set<Ticket> ticket = new HashSet<>();
	
}
