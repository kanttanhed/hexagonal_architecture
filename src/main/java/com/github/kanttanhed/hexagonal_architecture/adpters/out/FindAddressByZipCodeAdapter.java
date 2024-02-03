package com.github.kanttanhed.hexagonal_architecture.adpters.out;

import com.github.kanttanhed.hexagonal_architecture.adpters.out.client.FindAddressByZipCodeClient;
import com.github.kanttanhed.hexagonal_architecture.adpters.out.client.mapper.AddressResponseMapper;
import com.github.kanttanhed.hexagonal_architecture.application.core.domain.Address;
import com.github.kanttanhed.hexagonal_architecture.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var addressResponse = findAddressByZipCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
