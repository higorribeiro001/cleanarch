package com.araujo.cleanarch.core.usecase;

import com.araujo.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);
}
