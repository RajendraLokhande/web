package com.springboot.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.Dto.MovieDto;
import com.springboot.Service.MovieService;


@RestController
@RequestMapping("/api/")
public class MovieController {

	@Autowired
	private MovieService movieService;
	 
	@PostMapping("/saveMovie")
	public ResponseEntity<MovieDto> saveMovie(@RequestBody MovieDto Dto){
	
	MovieDto addMovie = movieService.addMovie(Dto);	
	return new ResponseEntity<MovieDto>(addMovie, HttpStatus.CREATED);
	}	
	
	@GetMapping("/movie/{id}")
	public ResponseEntity<MovieDto> saveMovie(@PathVariable Integer id){
			
		MovieDto movie = movieService.getMovie(id);
		return new ResponseEntity<MovieDto>(movie, HttpStatus.OK);
	}
	
	@GetMapping("/Movies")
	public ResponseEntity<List<MovieDto>> getAllMovie(){
		
	List <MovieDto>	movie=movieService.getAllMovie();
	return new ResponseEntity<List<MovieDto>>(movie, HttpStatus.OK);		
	
   }
	
	@PostMapping("/savemovie")
	public ResponseEntity<?> saveMovies(@RequestParam("file")MultipartFile file,@RequestParam("Name")String Name,@RequestParam("category")String category,@RequestParam("genre") String genre,@RequestParam("rating") String rating,@RequestParam("releaseDate")String releaseDate) throws IOException{	
		String saveMovie = movieService.saveMovie(file, Name, category, genre, rating, releaseDate);
		
		return ResponseEntity.status(HttpStatus.OK).body(saveMovie);
	}
	
	
}






