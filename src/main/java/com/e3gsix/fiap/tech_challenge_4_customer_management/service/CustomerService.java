package com.e3gsix.fiap.tech_challenge_4_customer_management.service;

import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;
import org.springframework.http.ResponseEntity;


public interface CustomerService {

    Customer findById(Long customerId);

    ResponseEntity<?> create(Customer customer);

    Customer update(Long customerId, Customer customer);

    Customer delete(Long customerId);
}
