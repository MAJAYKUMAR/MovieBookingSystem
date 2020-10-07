package com.dxc.mbs.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Movie implements Serializable {

	
	@Id
	private int movie_id;
	private String movie_name;
	private double movie_rating;
	private String movie_duration;
	private String movie_category;
	private String movie_recommend;
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	
	public double getMovie_rating() {
		return movie_rating;
	}
	public void setMovie_rating(double movie_rating) {
		this.movie_rating = movie_rating;
	}
	public String getMovie_duration() {
		return movie_duration;
	}
	public void setMovie_duration(String movie_duration) {
		this.movie_duration = movie_duration;
	}
	public String getMovie_category() {
		return movie_category;
	}
	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}
	public String getMovie_recommend() {
		return movie_recommend;
	}
	public void setMovie_recommend(String movie_recommend) {
		this.movie_recommend = movie_recommend;
	}
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_name=" + movie_name + ", movie_rating=" + movie_rating
				+ ", movie_duration=" + movie_duration + ", movie_category=" + movie_category + ", movie_recommend="
				+ movie_recommend + "]";
	}
	
	
	

}
