package com.dxc.mbs.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dxc.mbs.entity.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> { // JpaRepo extends CrudRepo

	

}
