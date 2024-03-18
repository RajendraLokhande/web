package com.springboot.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Movie_Dtls")
public class Movie {
	
	
	@Id
	@Column(name="Movie_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="Movie_Name")
	private String Name;
	
	@Lob
	@Column(name="Poster" ,columnDefinition = "LONGBLOB")
	private byte[] poster;
	
	@Column(name="Movie_ReleaseDate")
	private String releaseDate;
	
	@Column(name="-Category")
	private String category;
	 
	@Column(name="Movie-Genre")
	private String genre;
	
	@Column(name="Movie-Rating")
	private String rating;
	
	@Column(name="Movie-Country")
	private String country;
	
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL )
    private Set<Booking> booking = new HashSet<>();
	
//	@OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
//	private Set<Ticket> ticket = new HashSet<>(); 
	
	
	}	
	

