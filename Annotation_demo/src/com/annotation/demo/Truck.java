package com.annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle{
  @Override
  public String makeNoise(String noise)
  {
	 return noise+" bla bla!"; 
  }
}
