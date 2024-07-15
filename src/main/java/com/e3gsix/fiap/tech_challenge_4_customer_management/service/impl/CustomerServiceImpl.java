package com.e3gsix.fiap.tech_challenge_4_customer_management.service.impl;

import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;
import com.e3gsix.fiap.tech_challenge_4_customer_management.repository.CustomerRepository;
import com.e3gsix.fiap.tech_challenge_4_customer_management.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer findById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public ResponseEntity<?> create(Customer customer) {

        return ResponseEntity.ok(customerRepository.save(customer));
    }

    @Override
    public Customer update(Long customerId, Customer customer) {
        Customer customerExist = customerRepository.findById(customerId).orElse(null);

        if (customerExist != null) {
            customerExist.setName(customer.getName());
            customerExist.setUf(customer.getUf());
            customerExist.setAddress(customer.getAddress());
            customerRepository.save(customerExist);
        }
        return customerExist;
    }

    @Override
    public Customer delete(Long customerId) {
        Customer customerExist = customerRepository.findById(customerId).orElse(null);

        if (customerExist != null) {
            customerRepository.delete(customerExist);
        }
        return customerExist;
    }
}
