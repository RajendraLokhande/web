package com.blog.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="User_Info")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Id")
	private Integer id;

	@Column(name="User_Name")
	private String name;

	@Column(name="User-Email")
	private String email;
	
	@Column(name="User_About")
	private String about;

	@Column(name="User_Password")
    private String password;
	
	@OneToMany(mappedBy = "user", 	cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Post> posts= new ArrayList<>();
	
		
}
 