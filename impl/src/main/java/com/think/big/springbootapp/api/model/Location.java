package com.think.big.springbootapp.api.model;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class Location implements Serializable {

    private static final long serialVersionUID = 5551403232699706666L;

    @NotNull
    private String addressName;

    @NotNull
    private String city;

}