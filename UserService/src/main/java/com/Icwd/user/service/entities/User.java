package com.Icwd.user.service.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="micro_users")
public class User {

	
	@Id
	@Column(name="ID")
	private String userId;
	
	@Column(name="Name", length = 20)
    private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ABOUT")
	private String about;

	
	@Transient
	private List <Rating> ratings = new ArrayList<>();
	
	
		
	}
	
	
	
	
	
