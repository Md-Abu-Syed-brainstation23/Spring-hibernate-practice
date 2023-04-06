package com.spring.newpractice;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //retrieve bean from the container
		Vehicle toyotaCar=context.getBean("toyotaCar",Vehicle.class);
		System.out.println(toyotaCar.makeSound("Bee bee...."));
		context.close();
	}

}
