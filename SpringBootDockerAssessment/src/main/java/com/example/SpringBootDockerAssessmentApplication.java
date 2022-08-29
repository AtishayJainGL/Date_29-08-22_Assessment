/*write a simple springboot application and Create docker image for this application*/

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerAssessmentApplication.class, args);
	}
	
	@GetMapping("/hi")

	 public String sayHi()

	 {

	 return "Welcome To Docker Application for the Assessment";

	 }


}
