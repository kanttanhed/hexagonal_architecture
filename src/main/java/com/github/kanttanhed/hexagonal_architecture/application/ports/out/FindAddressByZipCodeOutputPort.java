package com.github.kanttanhed.hexagonal_architecture.application.ports.out;

import com.github.kanttanhed.hexagonal_architecture.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipcode);
}
