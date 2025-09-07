package com.araujo.cleanarch.core.dataprovider;

import com.araujo.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String id);
}
