package com.github.kanttanhed.hexagonal_architecture.adpters.out.repository;

import com.github.kanttanhed.hexagonal_architecture.adpters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
