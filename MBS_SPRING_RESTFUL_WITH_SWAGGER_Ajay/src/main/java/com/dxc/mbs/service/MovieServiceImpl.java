package com.dxc.mbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.mbs.entity.Movie;
import com.dxc.mbs.repository.IMovieRepository;


@Service
public  class MovieServiceImpl implements IMovieService {

	@Autowired
	IMovieRepository repo;
	
	@Autowired
	Movie emptyProduct;

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return repo.save(movie);
	}

	@Override
	public void deleteMovie(int movie_id) {
		// TODO Auto-generated method stub
		 repo.deleteById(movie_id);
	}

	@Override
	public List<Movie> getAllMovie() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
