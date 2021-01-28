package com.think.big.springbootapp.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerInfoResponse implements Serializable {

    private static final long serialVersionUID = 1076436349695599264L;
    private String id;
    private String status;

}