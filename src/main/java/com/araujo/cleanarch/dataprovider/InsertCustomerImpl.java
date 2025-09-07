package com.araujo.cleanarch.dataprovider;

import com.araujo.cleanarch.core.dataprovider.InsertCustomer;
import com.araujo.cleanarch.core.domain.Customer;
import com.araujo.cleanarch.dataprovider.repository.CustomerRepository;
import com.araujo.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
