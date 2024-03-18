package com.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="User_Dts")
public class User {

	
	@Id
	@Column(name="User-Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String fname;
	private String lname;
	private String email;
	private String gender;
    private String courseName;
    private String totalNumber;
	
	
	
}
