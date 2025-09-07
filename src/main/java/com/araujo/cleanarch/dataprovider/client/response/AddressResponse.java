package com.araujo.cleanarch.dataprovider.client.response;

import lombok.Data;

@Data // getters e setters, usar esse e outros frameworks somente fora (no caso no dataprovider)
public class AddressResponse {
    private String street;

    private String city;

    private String state;
}
