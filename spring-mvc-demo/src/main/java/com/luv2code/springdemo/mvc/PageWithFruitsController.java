package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/services")
public class PageWithFruitsController {
  
	@RequestMapping("/form")
	public String showPage()
	{
		return "fruit-names";
	}
	@RequestMapping("/submitted-data")
	public String showSubmittedData()
	{
		return "submittedData";
	}
}
