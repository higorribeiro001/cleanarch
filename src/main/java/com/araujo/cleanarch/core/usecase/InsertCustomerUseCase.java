package com.araujo.cleanarch.core.usecase;

import com.araujo.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String cep);
}
