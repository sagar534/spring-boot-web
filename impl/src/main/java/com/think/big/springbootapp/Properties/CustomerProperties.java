package com.think.big.springbootapp.Properties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@PropertySource("classpath:customerProperties.properties")
public class CustomerProperties {

    private static final String CREDIT_TAILOR_UUID_PREFIX = "CT-";


    public String getCreditTailorChannel() {
//        return ctConsulConfigService.getProperty(CT_CHANNEL) != null ? ctConsulConfigService.getProperty(CT_CHANNEL) : env.getProperty(CT_CHANNEL);
        return new StringBuilder(CREDIT_TAILOR_UUID_PREFIX)
                .append(UUID.randomUUID()).toString();
    }


}