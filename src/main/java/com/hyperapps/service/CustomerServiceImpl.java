package com.hyperapps.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hyperapps.dto.CustomerDTO;
import com.hyperapps.model.Customer;
import com.hyperapps.util.CommonUtils;

@Component
public class CustomerServiceImpl implements CustomerService {

	@Override
	public ResponseEntity<Object> addCustomer(CustomerDTO customerDto) {
		Customer customer = CommonUtils.convertToEntity(customerDto, Customer.class);
		// TODO Auto-generated method stub
		return null;
	}
	

}
