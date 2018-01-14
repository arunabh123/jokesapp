package com.arunabh.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arunabh.jokesapp.service.JokeService;

@Controller
public class JokeController {
	private JokeService jokeService;

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	@RequestMapping({"/getJoke",""})
	public String getJoke(Model model){
		
		model.addAttribute("joke",jokeService.getJoke());
		
		return "chucknorris";
	}
	
}
