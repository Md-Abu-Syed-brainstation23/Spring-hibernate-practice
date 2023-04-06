package com.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Professor {
	@Autowired
	@Qualifier("truck")
	private Vehicle privateCar;
	@Autowired
	public Professor()
	{
		System.out.println("Inside professor constructor>>");
	}
//	@Autowired
//	public void doSomeCrazyStuff(Car car)
//	{   System.out.println("Inside do some crazy stuff method!");
//		privateCar=car;
//	}
	public String getNoiseFromCar()
	{
		return privateCar.makeNoise("beep beep!");
	}

}
