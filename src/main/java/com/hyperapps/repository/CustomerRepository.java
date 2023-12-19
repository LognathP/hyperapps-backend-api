package com.hyperapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.hyperapps.model.Customer;

@Component
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
