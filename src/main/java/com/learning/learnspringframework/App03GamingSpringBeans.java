package com.learning.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.learnspringframework.game.GameRunner;

public class App03GamingSpringBeans {
	public static void main(String[] args)
	{
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
 	}
		

}
