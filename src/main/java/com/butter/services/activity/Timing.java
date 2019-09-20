package com.butter.services.activity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Timing {

    public Timing (){

    }

    @Getter @Setter
    private String timezone;

    @Getter @Setter
    private String utc;

}