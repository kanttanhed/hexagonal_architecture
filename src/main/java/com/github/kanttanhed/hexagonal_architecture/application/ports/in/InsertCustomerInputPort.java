package com.github.kanttanhed.hexagonal_architecture.application.ports.in;

import com.github.kanttanhed.hexagonal_architecture.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}