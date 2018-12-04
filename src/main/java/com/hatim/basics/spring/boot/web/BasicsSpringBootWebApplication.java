package com.hatim.basics.spring.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.hatim.basics.spring.boot.web")
public class BasicsSpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicsSpringBootWebApplication.class, args);
	}
	
}
