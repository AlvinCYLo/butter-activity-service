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
public class PriceLevel {

    @JsonProperty("type")
    private String type;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("min")
    private Integer min;

    @JsonProperty("max")
    private Integer max;
}