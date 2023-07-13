package com.learning.learnspringframework.game;

import com.learning.learnspringframework.GamingConsole;

public class PacmanGame implements GamingConsole{
	
	public void up()
	{
		System.out.println("Top");
	}
	public void down()
	{
		System.out.println("Down");
	}
	public void left()
	{
		System.out.println("Left");
	}
	public void right()
	{
		System.out.println("Right");
	}
}
