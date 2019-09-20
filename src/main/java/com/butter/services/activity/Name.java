package com.butter.services.activity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {

    public Name (){

    }

    @Getter @Setter
    private String text;

}