package com.springboot.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.Dto.MovieDto;
import com.springboot.Entity.Movie;
import com.springboot.Repository.MovieRepository;
import com.springboot.Service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	public MovieDto addMovie(MovieDto dto) {
		
		Movie movie = this.modelMapper.map(dto, Movie.class);
		
		Movie save = movieRepository.save(movie);
		
		return this.modelMapper.map(save, MovieDto.class);
		
	}

	@Override
	public MovieDto getMovie(Integer id) {
		Movie movie=movieRepository.findById(id).orElse(null);
		return this.modelMapper.map(movie, MovieDto.class);
		
	}
	public List<MovieDto> getAllMovie() {
		List<Movie>List= movieRepository.findAll();
		List<MovieDto> List2 = List.stream().map((list1)-> modelMapper.map(list1, MovieDto.class)).collect(Collectors.toList());
		return List2;
	}

	@Override
	public MovieDto deleteMovie(Integer id) {
		return null;
	}

	@Override
	public MovieDto updateMovie(MovieDto dto, Integer id) {
		return null;
	}

	@Override
	public String saveMovie(MultipartFile file, String Name, String category, String genre, String rating,
			String releaseDate) {
		
		
			
			Movie movies = new Movie();
			movies.setCategory(category);
			movies.setGenre(genre);
			movies.setName(Name);
			movies.setRating(rating);
			movies.setReleaseDate(releaseDate);
			try {
			movies.setPoster(file.getBytes());
			}catch(Exception e) {
				
				e.printStackTrace();
			}
			movieRepository.save(movies);
			return "Saved Movie SuccesFully.....!!";
		
		
	
		
		
	}

}
