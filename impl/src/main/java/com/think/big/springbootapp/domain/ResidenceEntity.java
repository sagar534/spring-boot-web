package com.think.big.springbootapp.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
public class ResidenceEntity {
    @Indexed
    private String residenceType;
}
