package com.dxc.mbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dxc.mbs.entity.Movie;
import com.dxc.mbs.service.IMovieService;

@RestController
@RequestMapping(path="/mbs")
public class MovieRestController {


	@Autowired
	Movie movie;

	@Autowired
	IMovieService service;
	
	@PostMapping(path = "/add", consumes = {"application/json" ,"application/xml"}, produces = { "application/json","application/xml" })
	public Movie add(@RequestBody Movie movie) {
		return service.addMovie(movie);

	}
	
	@GetMapping(path="/movies")
	public List<Movie>  getAllMovie(){
		
		return service.getAllMovie();
		
		
	}
	

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int movie_id) {

		
		service.deleteMovie(movie_id);

		return "Product deleted with id  " + movie_id;

	}
	
	
	
	
	
	
	
	

}
