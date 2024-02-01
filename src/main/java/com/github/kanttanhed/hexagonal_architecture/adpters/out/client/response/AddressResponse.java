package com.github.kanttanhed.hexagonal_architecture.adpters.out.client.response;

import lombok.Data;

@Data
public class AddressResponse {

    private String street;

    private String city;

    private String state;
}
