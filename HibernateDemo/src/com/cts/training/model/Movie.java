package com.cts.training.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
@Id
@GeneratedValue
private int id;
private String name;
//@OneToMany(mappedBy="movie")
//private Set<Actor> actors;
@ManyToOne
@JoinColumn(name="movie_id")
private Movie movie;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//public Set<Actor> getActors() {
//	return actors;
//}
//public void setActors(Set<Actor> actors) {
//	this.actors = actors;
//}
//
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}





}
