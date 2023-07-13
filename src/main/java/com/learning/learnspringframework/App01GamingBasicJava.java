package com.learning.learnspringframework;

import com.learning.learnspringframework.game.GameRunner;
import com.learning.learnspringframework.game.MarioGame;
import com.learning.learnspringframework.game.PacmanGame;
import com.learning.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();  //Object Creation
		var gameRunner = new GameRunner(game);  //Object Creation + wiring of Dependencis   // Game is a dependency of GameRunner
		gameRunner.run();
	}

}
