package com.learning.learnspringframework.HelloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1: Launch a Spring Context
					var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Configure the things that we want to manage - @Configuration
									
					//Retriving Bean managed by Spring
					System.out.println(context.getBean("name"));
					System.out.println(context.getBean("person"));
					System.out.println(context.getBean("personMethod2Calling"));
					System.out.println(context.getBean("address2"));
					//System.out.println(context.getBean(Address.class));
					
					Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
					
	}

}
