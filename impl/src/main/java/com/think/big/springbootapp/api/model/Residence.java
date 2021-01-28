package com.think.big.springbootapp.api.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class Residence implements Serializable {


    private static final long serialVersionUID = 2790430015637723381L;

    @NotNull
    @Valid
    private String residenceType;

}