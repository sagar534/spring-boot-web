package com.think.big.springbootapp.manager;

import com.think.big.springbootapp.Properties.CustomerProperties;
import com.think.big.springbootapp.api.model.CustomerInfoRequest;
import com.think.big.springbootapp.api.model.CustomerInfoResponse;
import com.think.big.springbootapp.util.CustomerIdUtil;
import com.think.big.springbootapp.util.Response;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Log4j2
@Component
public class PostCustomerInfoManagerImpl implements PostCustomerInfoManager {


    @Autowired
    private CustomerIdUtil customerIdUtil;

    @Autowired
    CustomerProperties customerProperties;
    @Override
    public CustomerInfoResponse postCustomer(CustomerInfoRequest request) {
        String customerUuid = customerIdUtil.generateCtUUId(customerProperties.getCustomerIdPrefix());

        //1. Request validation

        //2. Mapping to databtase

        //3 store into database

        //4 map response back to response object
        CustomerInfoResponse response=new CustomerInfoResponse();
        response.setId(customerUuid);
        return response;
    }
}
