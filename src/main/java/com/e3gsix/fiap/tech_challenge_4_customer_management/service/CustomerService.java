package com.e3gsix.fiap.tech_challenge_4_customer_management.service;

import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;


public interface CustomerService {

    Customer findById(Long customerId);

    Customer create(Customer customer);

    Customer update(Long customerId, Customer customer);

    Customer delete(Long customerId);
}
