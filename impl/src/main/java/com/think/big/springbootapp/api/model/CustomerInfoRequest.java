package com.think.big.springbootapp.api.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Data
public class CustomerInfoRequest implements Serializable {
    @NotNull
    @Size(max = 20)
    public String firstName;

    @Size(max = 25)
    public String middleName;

    @NotNull
    @Size(max = 20)
    public String lastName;

    @Valid
    public String socialSecurityNumber;

    @NotNull
    @Valid
    public BirthData birthData;

    @NotNull
    @Valid
    public List<AddressLong> addresses;

    @NotNull
    @Valid
    public List<ContactDetail> contactDetails;

    @NotNull
    @Valid
    public Residence residence;
}
