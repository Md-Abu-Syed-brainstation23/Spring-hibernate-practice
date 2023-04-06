package com.annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

 @Override
 public String makeNoise(String noiseSound)
 {
	 return noiseSound;
 }
}
