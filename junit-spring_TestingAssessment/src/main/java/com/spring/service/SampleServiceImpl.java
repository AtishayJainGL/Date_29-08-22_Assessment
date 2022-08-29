
package com.spring.service;



import java.util.Date;

import java.util.Random;

import com.unit.obj.Service;



public class SampleServiceImpl implements SampleService {



 public String getOrderDescription() {

	Service existingOrder = new Service();

 existingOrder.setServicedescription("This is the new Service");

 return "Description: " + existingOrder.getServicedescription();

 }



 public String getOrderStringCode() {

 Service existingOrder = new Service();

 existingOrder.setServiceCode("ABCDE");

 return "Account Code: " + existingOrder.getServiceCode();

 }

	

 public Service createOrder(Service order) {

	 Service newService= new Service();

 newService.setServiceId(new Random().nextInt());

 newService.setServiceCode("ABCDE");

 newService.setServiceStatus("INITIATED");

 newService.setServiceDate(new Date());

 return newService;

 }

	

 public Service getOrder(int id) {

	 Service newService = new Service();

 newService.setServiceId(new Random().nextInt());

 newService.setServiceCode("ABCDE");

 newService.setServiceStatus("COMPLETED");

 newService.setServiceDate(new Date());

 newService.setServicedescription("This is the new Service");

 return newService;

 }

}