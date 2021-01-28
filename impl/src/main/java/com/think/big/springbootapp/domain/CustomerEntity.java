package com.think.big.springbootapp.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = CustomerEntity.DOCUMENT_COLLECTION_NAME)
public class CustomerEntity implements Serializable {
    public static final String DOCUMENT_COLLECTION_NAME = "customer";

    private static final long serialVersionUID = -8125964866548653342L;

    @Id
    private String customerId;

    private String firstName;

    private String lastName;
}
