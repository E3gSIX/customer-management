package com.e3gsix.fiap.tech_challenge_4_customer_management.controller;

import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomerController {

    ResponseEntity<?> create(@RequestBody Customer customer);

    ResponseEntity<?> findById(@PathVariable Long customerId);

    ResponseEntity<?> update(@PathVariable Long customerId, @RequestBody Customer customer);

    ResponseEntity<?> delete(@PathVariable Long customerId);
}
