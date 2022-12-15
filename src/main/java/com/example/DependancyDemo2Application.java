package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//This annotation is used to mark the main class of a spring boot
public class DependancyDemo2Application 
{

	public static void main(String[] args)
	{
		//This line will return the object at the time of execution
		ConfigurableApplicationContext context=SpringApplication.run(DependancyDemo2Application.class, args);
		
		//in this line we trying to tell the spring container to return object of Customers class  
		Customers custObj=context.getBean(Customers.class);
		
		custObj.dispaly();
	}

}
