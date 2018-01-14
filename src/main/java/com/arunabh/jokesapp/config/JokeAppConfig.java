package com.arunabh.jokesapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class JokeAppConfig {

	@Bean
	ChuckNorrisQuotes chuckNorrisQuotes(){
		return new ChuckNorrisQuotes();
	}
	
}
