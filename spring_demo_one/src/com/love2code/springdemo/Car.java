package com.love2code.springdemo;

import org.springframework.stereotype.Component;

@Component("toyotaCar")
public class Car implements Vehicle {
	 @Override
     public String makeSound(String hornSound)
     {
    	 return hornSound;
     }
}
