package com.learning.learnspringframework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor ,
//equals, hascode and toString are automatically created.
//Released in JDK 16

record Person(String name, int age) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name()
	{
		return "Vishall";
	}
	@Bean
	public int age()
	{
		return 23;
	}
	@Bean
	public Person person(){
		return new Person("vishall",21);
	}
	
	@Bean
	public Person personMethod2Calling()
	{
		return new Person(name(),age());
	}
	
	@Bean
	public Person person3Parameters(String name, int age)
	{
		return new Person(name,age);
	}
	
	@Bean(name="address1")
	public Address address()
	{
		return new Address("Baker Street", "London");
	}
	@Bean
	public Address address2()
	{
		return new Address("Baker Street", "London");
	}
	
}
