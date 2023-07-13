package com.learning.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.learnspringframework.game.GameRunner;
import com.learning.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game()
	{
		var game = new PacmanGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner()
	{
		var gameRunner = new GameRunner(game());
		return gameRunner;
	}
}
