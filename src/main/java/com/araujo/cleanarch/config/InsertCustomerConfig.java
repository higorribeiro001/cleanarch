package com.araujo.cleanarch.config;

import com.araujo.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.araujo.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.araujo.cleanarch.dataprovider.InsertCustomerImpl;
import com.araujo.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
