package com.example.demo.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CustomerController {
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	@RequestMapping("/hello")
	public String showCustomer(@RequestParam("customer_id") int customer_Id,@RequestParam("customer_name") String customer_Name,@RequestParam("customer_phone") int customer_Phone,@RequestParam("customer_address") String customer_Address,@RequestParam("customer_loginid") String customer_loginId,@RequestParam("customer_pass") int customer_Password,Model m) {
		m.addAttribute("customer_id",customer_Id);
		m.addAttribute("customer_name",customer_Name);
		m.addAttribute("customer_phone",customer_Phone);
		m.addAttribute("customer_address",customer_Address);
		m.addAttribute("customer_loginid",customer_loginId);
		m.addAttribute("customer_pass",customer_Password);
		
		
		return "display.jsp";
		
		
		
	}

}