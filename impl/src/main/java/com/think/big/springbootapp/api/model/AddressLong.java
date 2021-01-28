package com.think.big.springbootapp.api.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class AddressLong implements Serializable{


    private static final long serialVersionUID = 3536991107317007641L;
    @NotNull
    @Valid
    private String addressType;

    @NotNull
    @Valid
    private Location location;
}