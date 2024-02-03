package com.github.kanttanhed.hexagonal_architecture.adpters.out.client.mapper;

import com.github.kanttanhed.hexagonal_architecture.adpters.out.client.response.AddressResponse;
import com.github.kanttanhed.hexagonal_architecture.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
