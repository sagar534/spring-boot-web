package com.think.big.springbootapp.api.constants;

import lombok.experimental.UtilityClass;


@UtilityClass
public class CustomerInfoApiPathConstants {

    public static final String PATH_BASE = "/api/v3/customer-info";
    public static final String PATH_BASE_GET = "/{customerId}";

    public static final String POST_CUSTOMER_SERVICE_ID = "post-customer-v3";
}