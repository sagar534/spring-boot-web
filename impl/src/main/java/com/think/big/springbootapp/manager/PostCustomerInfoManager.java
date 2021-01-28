package com.think.big.springbootapp.manager;


import com.think.big.springbootapp.api.model.CustomerInfoRequest;
import com.think.big.springbootapp.api.model.CustomerInfoResponse;
import com.think.big.springbootapp.util.Response;

public interface PostCustomerInfoManager {

    Response<CustomerInfoResponse> postCustomer(CustomerInfoRequest request);


}