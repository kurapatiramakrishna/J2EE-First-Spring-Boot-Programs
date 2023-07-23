package com.jsp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootfirstprojectApplication 
{

	public static void main(String[] args) 
	{
	ConfigurableApplicationContext context  = SpringApplication.run(SpringbootfirstprojectApplication.class, args);
	
	project project=context.getBean(project.class);
	System.out.println(project);
	}

}
