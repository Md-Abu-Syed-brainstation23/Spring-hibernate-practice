package com.annotation.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForCodeConfig {
	public static void main(String [] l)
	{
		//load the spring configuration file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanFactoryWithCode.class);
	    //retrieve bean from the container
		Professor csProfessor=context.getBean("getProfessor",Professor.class);
		
		System.out.println(csProfessor.getNoiseFromCar());
		
		context.close();
	}
}
