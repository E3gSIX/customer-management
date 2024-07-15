package com.e3gsix.fiap.tech_challenge_4_customer_management.controller.impl;

import com.e3gsix.fiap.tech_challenge_4_customer_management.controller.CustomerController;
import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;
import com.e3gsix.fiap.tech_challenge_4_customer_management.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerControllerImpl implements CustomerController {

    private final CustomerService customerService;

    @PostMapping
    @Override
    public ResponseEntity<?> create(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @GetMapping("/{customerId}")
    @Override
    public ResponseEntity<?> findById(@PathVariable Long customerId) {
        Customer customer = customerService.findById(customerId);
        return ResponseEntity.ok(customer);

    }

    @PutMapping("/{customerId}")
    @Override
    public ResponseEntity<?> update(@PathVariable Long customerId, @RequestBody Customer customer) {
        Customer customerUpdated = customerService.update(customerId, customer);
        return ResponseEntity.ok(customerUpdated);
    }

    @DeleteMapping("/{customerId}")
    @Override
    public ResponseEntity<?> delete(@PathVariable Long customerId) {
        Customer customerDeleted = customerService.delete(customerId);
        return ResponseEntity.ok().build();
    }
}
