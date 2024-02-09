package com.github.kanttanhed.hexagonal_architecture.adpters.out;

import com.github.kanttanhed.hexagonal_architecture.adpters.out.repository.CustomerRepository;
import com.github.kanttanhed.hexagonal_architecture.adpters.out.repository.mapper.CustomerEntityMapper;
import com.github.kanttanhed.hexagonal_architecture.application.core.domain.Customer;
import com.github.kanttanhed.hexagonal_architecture.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {

        var CustomerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(CustomerEntity);
    }
}
