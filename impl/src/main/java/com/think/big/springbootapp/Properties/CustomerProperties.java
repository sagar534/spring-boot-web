package com.think.big.springbootapp.Properties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@PropertySource("classpath:customerProperties.properties")
public class CustomerProperties {

    private static final String CUSTOMER_ID_PREFIX = "CO-";


    public String getCustomerIdPrefix() {
//        return ctConsulConfigService.getProperty(CT_CHANNEL) != null ? ctConsulConfigService.getProperty(CT_CHANNEL) : env.getProperty(CT_CHANNEL);
        return CUSTOMER_ID_PREFIX;
    }


}