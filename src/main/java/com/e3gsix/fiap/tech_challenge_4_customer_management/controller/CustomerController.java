package com.e3gsix.fiap.tech_challenge_4_customer_management.controller;

import com.e3gsix.fiap.tech_challenge_4_customer_management.model.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(
        name = "Clientes [CustomerController]",
        description = "Controlador que fornece os serviços de gerenciamento de clientes."
)
public interface CustomerController {

    @Operation(summary = "Criar um cliente.")
    ResponseEntity<?> create(@RequestBody Customer customer);

    @Operation(summary = "Buscar um cliente pelo ID.")
    ResponseEntity<?> findById(@PathVariable Long customerId);

    @Operation(summary = "Atualizar um cliente.")
    ResponseEntity<?> update(@PathVariable Long customerId, @RequestBody Customer customer);

    @Operation(summary = "Deletar um cliente pelo ID.")
    ResponseEntity<?> delete(@PathVariable Long customerId);
}
