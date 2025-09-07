package com.araujo.cleanarch.dataprovider;

import com.araujo.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.araujo.cleanarch.core.domain.Address;
import com.araujo.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.araujo.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {
    @Autowired // injeção de dependencia
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
