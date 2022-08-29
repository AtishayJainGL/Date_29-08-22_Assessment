package com.junit.spring.main;



import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.spring.service.SampleService;
import com.spring.service.SampleServiceImpl;



@Configuration

public class AppConfig {

 @Bean

 public SampleService getSampleService() {

 return new SampleServiceImpl();

 }

}