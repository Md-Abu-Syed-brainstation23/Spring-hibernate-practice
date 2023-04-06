package com.love2code.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //retrieve bean from the container
		Car toyotaCar=context.getBean("toyotaCar",Car.class);
		System.out.println(toyotaCar.makeSound("Bee bee...."));
	}

}
