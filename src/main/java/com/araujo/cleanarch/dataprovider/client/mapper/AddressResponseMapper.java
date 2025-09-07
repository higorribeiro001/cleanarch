package com.araujo.cleanarch.dataprovider.client.mapper;


import com.araujo.cleanarch.core.domain.Address;
import com.araujo.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
