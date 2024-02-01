package com.github.kanttanhed.hexagonal_architecture.adpters.out.client;


import com.github.kanttanhed.hexagonal_architecture.adpters.out.client.response.AddressResponse;
import com.github.kanttanhed.hexagonal_architecture.application.core.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "findAddressByZipCodeClient",
        url = "${plinio.client.address.url}"
)
public interface findAddressByZipCodeClient {

    @GetMapping("/{zipcode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
