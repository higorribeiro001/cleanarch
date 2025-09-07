package com.araujo.cleanarch.dataprovider.repository.mapper;

import com.araujo.cleanarch.core.domain.Customer;
import com.araujo.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
