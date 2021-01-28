package com.think.big.springbootapp.util;

import com.think.big.springbootapp.Properties.CustomerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CustomerIdUtil {

    @Autowired
    CustomerProperties loansProperties;

    private static final String CREDIT_TAILOR_UUID_PREFIX = "CT-";


    public String generateCtUUId() {
        return new StringBuilder(CREDIT_TAILOR_UUID_PREFIX)
                .append(UUID.randomUUID()).toString();
    }


}