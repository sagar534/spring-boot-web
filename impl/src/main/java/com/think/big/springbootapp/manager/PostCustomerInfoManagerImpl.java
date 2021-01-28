package com.think.big.springbootapp.manager;

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
    @Override
    public Response<CustomerInfoResponse> postCustomer(CustomerInfoRequest request) {
        String customerUuid = customerIdUtil.generateCtUUId();
        CustomerInfoResponse response=new CustomerInfoResponse();
        response.setId(customerUuid);
        return Response.<CustomerInfoResponse>builder()
                .data(response)
                .build();
    }
}
