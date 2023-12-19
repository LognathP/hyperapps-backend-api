package com.hyperapps.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hyperapps.dto.CustomerDTO;
import com.hyperapps.security.JwtTokenUtil;
import com.hyperapps.service.CustomerService;

public class CustomerController {
	
private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	

    Logger logger = LoggerFactory.getLogger(this.getClass());
		
	@Autowired
	CustomerService customerService;

	@PostMapping("/api/customer")
	public ResponseEntity<Object> addCustomer(@RequestBody CustomerDTO customerDto) {
		logger.info("Add Customer API Started at "+dateFormat);
		return customerService.addCustomer(customerDto);
	}
	
	@PostMapping("/api/login")
	public String login(@RequestParam String mobile ) {
		logger.info("Add Customer API Started at "+dateFormat);
		return mobile;
	}
	
	@PostMapping("/api/auth")
	public String auth(HttpServletRequest request,@RequestParam String mobile ) {
		logger.info("Add Customer API Started at "+dateFormat);
		
		return mobile;
	}
	
	

	
}
