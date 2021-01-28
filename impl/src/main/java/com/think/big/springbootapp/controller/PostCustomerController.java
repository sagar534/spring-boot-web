package com.think.big.springbootapp.controller;

import com.think.big.springbootapp.annotation.ServiceId;
import com.think.big.springbootapp.api.constants.CustomerInfoApiPathConstants;
import com.think.big.springbootapp.api.model.CustomerInfoRequest;
import com.think.big.springbootapp.api.model.CustomerInfoResponse;
import com.think.big.springbootapp.manager.PostCustomerInfoManager;
import com.think.big.springbootapp.util.Response;
import com.think.big.springbootapp.util.ResponseAsync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/customer-info/")
public class PostCustomerController {

    @Autowired
    PostCustomerInfoManager postCustomerInfoManager;
    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public CustomerInfoResponse postCreditTailor(@RequestBody @Valid CustomerInfoRequest request) {

//        return ResponseAsync.supplyAsync(() -> postCustomerInfoManager.postCustomer(request));
        return postCustomerInfoManager.postCustomer(request);
    }
}
