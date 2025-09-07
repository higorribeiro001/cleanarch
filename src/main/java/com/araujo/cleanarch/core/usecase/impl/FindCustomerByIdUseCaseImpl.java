package com.araujo.cleanarch.core.usecase.impl;

import com.araujo.cleanarch.core.dataprovider.FindCustomerById;
import com.araujo.cleanarch.core.domain.Customer;
import com.araujo.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.araujo.cleanarch.entrypoint.controller.request.CustomerRequest;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {
    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
