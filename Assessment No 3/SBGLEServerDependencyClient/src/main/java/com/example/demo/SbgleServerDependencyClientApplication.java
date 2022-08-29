/*write a simple Microservice application using Eureka server and Eureka Client*/
//CLIENT 
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbgleServerDependencyClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbgleServerDependencyClientApplication.class, args);
	} 
		@GetMapping

		 public String hi() {

		 return "Eureka Client for the Assessment .........Application";

		 
	}

}
//http://localhost:8080/