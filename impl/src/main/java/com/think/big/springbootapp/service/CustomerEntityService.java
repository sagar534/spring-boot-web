package com.think.big.springbootapp.service;

import com.think.big.springbootapp.domain.CustomerEntity;

public interface CustomerEntityService {

    CustomerEntity getCustomerByUuid(String ctUuid);

    CustomerEntity saveCustomerEntity(CustomerEntity customerEntity);

}