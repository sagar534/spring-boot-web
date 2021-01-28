package com.think.big.springbootapp.mapper;

import com.think.big.springbootapp.api.model.CustomerInfoRequest;
import com.think.big.springbootapp.api.model.CustomerInfoResponse;
import com.think.big.springbootapp.domain.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public abstract class CustomerEntityMapper {
    @Mapping(source = "firstName", target = "firstName")
    public abstract CustomerEntity map(CustomerInfoRequest customerInfoRequest);
}
