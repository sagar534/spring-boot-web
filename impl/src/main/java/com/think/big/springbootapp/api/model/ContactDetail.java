package com.think.big.springbootapp.api.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class ContactDetail implements Serializable{

    private static final long serialVersionUID = -7424093276795479599L;

    @NotNull
    private String contact;

    @NotNull
    @Valid
    private String contactType;

}