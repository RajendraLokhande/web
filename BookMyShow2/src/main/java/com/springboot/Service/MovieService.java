package com.springboot.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

//import org.springframework.web.multipart.MultipartFile;

import com.springboot.Dto.MovieDto;



public interface MovieService {

	
	public MovieDto addMovie(MovieDto dto);
	public MovieDto getMovie(Integer id);
	public List<MovieDto> getAllMovie();
	public MovieDto deleteMovie(Integer id);
	public MovieDto updateMovie(MovieDto dto,Integer id);

   
   public String saveMovie(MultipartFile file,String Name,String category,String genre,String rating,String releaseDate);







}

