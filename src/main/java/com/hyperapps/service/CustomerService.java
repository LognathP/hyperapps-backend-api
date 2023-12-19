package com.hyperapps.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hyperapps.dto.CustomerDTO;

@Service
public interface CustomerService {

	ResponseEntity<Object> addCustomer(CustomerDTO customerDto);
	
	

}
