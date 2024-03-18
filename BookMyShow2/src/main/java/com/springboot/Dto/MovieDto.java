package com.springboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MovieDto {

	private Integer id;
	
	private String Name;
	
	private Byte[] poster;
	
	private String releaseDate;
	
	private String category;
	
	private String genre;
	
	private String country;
	
	private String rating;

	
}
