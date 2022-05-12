package com.abreu.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abreu.dsmovie.dto.MovieDTO;
import com.abreu.dsmovie.dto.ScoreDTO;
import com.abreu.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/score")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		
		return service.saveScore(dto);
	}
}
