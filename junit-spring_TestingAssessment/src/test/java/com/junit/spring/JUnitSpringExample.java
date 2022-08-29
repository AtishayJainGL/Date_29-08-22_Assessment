/*write a spring application and test those application*/

package com.junit.spring;



import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.BaseMatcher.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.junit.spring.main.AppConfig;
import com.spring.service.SampleService;
import com.unit.obj.Service;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes=AppConfig.class,loader=AnnotationConfigContextLoader.class)

public class JUnitSpringExample {

 @Autowired

 private SampleService sampleService;

 @BeforeClass

 public static void setUp() {

 System.out.println("-----> Create The SETUP For Spring Testing <-----");

 }

 @Test

 public void testSampleService() {

 assertEquals("class com.spring.service.SampleServiceImpl",this.sampleService.getClass().toString());

 }

 @Test

 public void testSampleServiceGetAccountDescription() {

 //	Check if the return description has a 'Description:' string.

 assertTrue(sampleService.getOrderDescription().contains("Description:"));

 }

 @Test

 public void testSampleServiceGetAccountCode() {

 //	Check if the return description has a 'Code:' string.

 assertTrue(sampleService.getOrderStringCode().contains("Code:"));

 }

 @Test

 public void testSampleServiceCreateNewOrder() {

 Service newOrder = new Service();

 newOrder.setServiceCode("XYZ");

 newOrder.setServicedescription("Description");

 if(newOrder != null) {

 

  assertNotNull("Security isn't null", newOrder.getServiceCode());

  assertNotNull("Description isn't not null", newOrder.getServicedescription());

 }

 assertNotNull("New Order is not null", newOrder);

 }

 @Test

 public void testSampleServiceGetOrder() {

 Service existingOrder = sampleService.getOrder(0);

 if(existingOrder != null) {

  assertThat(sampleService.getOrder(0), instanceOf(Service.class));

  assertNotNull("Security isn't null", existingOrder.getServiceCode());

  assertNotNull("Description isn't null", existingOrder.getServicedescription());

 }

 assertNotNull("Object is not null", existingOrder);

 }

 @AfterClass

 public static void afterTest() {

 System.out.println("-----> DESTROY The SetUp <-----");

 }

}









