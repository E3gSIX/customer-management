package com.e3gsix.fiap.tech_challenge_4_customer_management.repository;

import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
