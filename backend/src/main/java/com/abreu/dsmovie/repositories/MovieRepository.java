package com.abreu.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abreu.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
