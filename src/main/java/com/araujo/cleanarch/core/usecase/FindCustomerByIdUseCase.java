package com.araujo.cleanarch.core.usecase;

import com.araujo.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
    Customer find(final String id);
}
