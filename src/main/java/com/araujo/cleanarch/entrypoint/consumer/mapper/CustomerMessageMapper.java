package com.araujo.cleanarch.entrypoint.consumer.mapper;

import com.araujo.cleanarch.core.domain.Customer;
import com.araujo.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
