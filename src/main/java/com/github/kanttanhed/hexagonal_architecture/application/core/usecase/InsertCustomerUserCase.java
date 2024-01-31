package com.github.kanttanhed.hexagonal_architecture.application.core.usecase;

import com.github.kanttanhed.hexagonal_architecture.application.core.domain.Customer;
import com.github.kanttanhed.hexagonal_architecture.application.ports.out.FindAddressByZipCodeOutputPort;
import com.github.kanttanhed.hexagonal_architecture.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUserCase  {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUserCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }

}