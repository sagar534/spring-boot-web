package com.think.big.springbootapp.util;

import com.think.big.springbootapp.Properties.CustomerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CustomerIdUtil {

    @Autowired
    CustomerProperties customerProperties;



    public String generateCtUUId(String prefix) {
        return new StringBuilder(prefix)
                .append(UUID.randomUUID()).toString();
    }


}