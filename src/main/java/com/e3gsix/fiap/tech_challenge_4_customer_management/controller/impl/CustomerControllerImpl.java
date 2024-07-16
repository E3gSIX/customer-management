package com.e3gsix.fiap.tech_challenge_4_customer_management.controller.impl;

import com.e3gsix.fiap.tech_challenge_4_customer_management.controller.CustomerController;
import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;
import com.e3gsix.fiap.tech_challenge_4_customer_management.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import static com.e3gsix.fiap.tech_challenge_4_customer_management.controller.impl.CustomerControllerImpl.URI_CUSTOMERS;

@RestController
@RequestMapping(URI_CUSTOMERS)
@RequiredArgsConstructor
public class CustomerControllerImpl implements CustomerController {
    public static final String URI_CUSTOMERS = "/customers";
    public static final String URI_CUSTOMER_ID = "/{customerId}";

    private final CustomerService customerService;

    @PostMapping
    @Override
    public ResponseEntity<?> create(@RequestBody Customer customer, UriComponentsBuilder uriComponentsBuilder) {
        Customer createdCustomer = this.customerService.create(customer);

        var uri = uriComponentsBuilder.path(URI_CUSTOMER_ID)
                .buildAndExpand(createdCustomer.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping(URI_CUSTOMER_ID)
    @Override
    public ResponseEntity<?> findById(@PathVariable Long customerId) {
        Customer customer = customerService.findById(customerId);
        return ResponseEntity.ok(customer);

    }

    @PutMapping(URI_CUSTOMER_ID)
    @Override
    public ResponseEntity<?> update(@PathVariable Long customerId, @RequestBody Customer customer) {
        Customer customerUpdated = customerService.update(customerId, customer);
        return ResponseEntity.ok(customerUpdated);
    }

    @DeleteMapping(URI_CUSTOMER_ID)
    @Override
    public ResponseEntity<?> delete(@PathVariable Long customerId) {
        customerService.delete(customerId);
        return ResponseEntity.ok().build();
    }
}
