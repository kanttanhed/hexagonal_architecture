package com.github.kanttanhed.hexagonal_architecture.application.ports.out;

import com.github.kanttanhed.hexagonal_architecture.application.core.domain.Customer;

public interface InsertCustomerOutputPort  {

    void insert(Customer customer);
}
