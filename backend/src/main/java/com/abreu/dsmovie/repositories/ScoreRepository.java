package com.abreu.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abreu.dsmovie.entities.Score;
import com.abreu.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
