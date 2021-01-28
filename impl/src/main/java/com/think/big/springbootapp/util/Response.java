package com.think.big.springbootapp.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response<T> {

    private T data;

    @JsonIgnore
    private boolean creation;

    @JsonIgnore
    private Integer status;

    @JsonIgnore
    private boolean redirection;

    @JsonIgnore
    private String location;

    @JsonIgnore
    private String redirectLocation;

    @JsonIgnore
    private final Map<String, String> extraHeaders = new HashMap<String, String>();

    public Response(T data) {
        super();
        this.data = data;
    }

}

