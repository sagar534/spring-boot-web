package com.think.big.springbootapp.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BirthData implements Serializable {


    private static final long serialVersionUID = -5953970742656248340L;

    private String birthDate;
}