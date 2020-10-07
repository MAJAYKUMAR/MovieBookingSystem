package com.dxc.mbs.service;
import java.util.List;

import com.dxc.mbs.entity.Movie;


public interface IMovieService {
	
	
	
	public Movie  addMovie(Movie movie);

	
	public void  deleteMovie(int movie_id);
	
	public List<Movie>  getAllMovie();
	
	



	
	
}
