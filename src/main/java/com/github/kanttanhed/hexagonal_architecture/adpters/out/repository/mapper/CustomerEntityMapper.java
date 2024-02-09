package com.github.kanttanhed.hexagonal_architecture.adpters.out.repository.mapper;

import com.github.kanttanhed.hexagonal_architecture.adpters.out.repository.entity.CustomerEntity;
import com.github.kanttanhed.hexagonal_architecture.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
