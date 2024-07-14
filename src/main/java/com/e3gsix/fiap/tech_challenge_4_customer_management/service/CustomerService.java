package com.e3gsix.fiap.tech_challenge_4_customer_management.service;

import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;
import org.springframework.http.ResponseEntity;


public interface CustomerService {

    public ResponseEntity<?> findById(Long customerId);

    public ResponseEntity<?> create(Customer customer);

    public ResponseEntity<?> update(Long customerId, Customer customer);

    public ResponseEntity<?> delete(Long customerId);
}
