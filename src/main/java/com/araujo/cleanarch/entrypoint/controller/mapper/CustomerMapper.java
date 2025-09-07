package com.araujo.cleanarch.entrypoint.controller.mapper;

import com.araujo.cleanarch.core.domain.Customer;
import com.araujo.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.araujo.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
