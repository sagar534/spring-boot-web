package com.think.big.springbootapp.service;

import com.think.big.springbootapp.domain.CustomerEntity;
import com.think.big.springbootapp.repository.CustomerRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
public class CustomerEntityServiceImpl implements CustomerEntityService {

    @Autowired
    CustomerRepository customerRepository;


    public CustomerEntity getCustomerByUuid(String ctUuid) {
        Optional<CustomerEntity> entity = customerRepository.
                findById(ctUuid);

       if(entity.isPresent()){
           return entity.get();
       }else{
           return null;
       }
    }

    @Override
    public CustomerEntity saveCustomerEntity(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }
}