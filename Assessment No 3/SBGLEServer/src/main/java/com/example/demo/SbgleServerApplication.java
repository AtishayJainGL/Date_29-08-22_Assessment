/*write a simple Microservice application using Eureka server and Eureka Client*/
//EUREKA SERVER
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbgleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbgleServerApplication.class, args);
	}

}
//http://localhost:8761
//http://localhost:8080
