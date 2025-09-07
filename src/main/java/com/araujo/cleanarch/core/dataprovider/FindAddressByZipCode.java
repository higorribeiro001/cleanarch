package com.araujo.cleanarch.core.dataprovider;

import com.araujo.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
