package com.github.kanttanhed.hexagonal_architecture.adpters.out.repository.entity;

import lombok.Data;

@Data
public class AddressEntity {

    private String street;

    private String city;

    private String state;
}
