package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		//load the spring configuration file
				ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		        //retrieve bean from the container
				Professor csProfessor=context.getBean("professor",Professor.class);
				
				System.out.println(csProfessor.getNoiseFromCar());
				
				context.close();

	}

}
