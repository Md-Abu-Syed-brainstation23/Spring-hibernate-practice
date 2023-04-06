package com.annotation.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.annotation.demo")
public class BeanFactoryWithCode {
    @Bean
	public Professor getProfessor()
	{
		return new Professor();
	}
}
