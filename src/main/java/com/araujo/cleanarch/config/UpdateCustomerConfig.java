package com.araujo.cleanarch.config;

import com.araujo.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.araujo.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.araujo.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.araujo.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
