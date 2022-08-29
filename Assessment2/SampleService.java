

package com.spring.service;



import com.unit.obj.Service;

public interface SampleService {

 public String getOrderDescription();

 public String getOrderStringCode();

 public Service getOrder(int id);

 public Service createOrder(Service order);

}

