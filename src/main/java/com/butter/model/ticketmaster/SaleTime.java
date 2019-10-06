package com.butter.model.ticketmaster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class SaleTime {

    @JsonProperty("startDateTime")
    private String startDateTime;

    @JsonProperty("endDateTime")
    private String endDateTime;

    @JsonProperty("name")
    private String name;

}