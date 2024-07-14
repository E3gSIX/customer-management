package com.e3gsix.fiap.tech_challenge_4_customer_management.controller;

import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;
import com.e3gsix.fiap.tech_challenge_4_customer_management.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<?> findById(@PathVariable Long customerId) {
        return customerService.findById(customerId);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<?> update(@PathVariable Long customerId, @RequestBody Customer customer) {
        return customerService.update(customerId, customer);
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<?> delete(@PathVariable Long customerId) {
        return customerService.delete(customerId);
    }
}
