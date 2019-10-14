package com.butter.model.eventbrite;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class MinimumTicketPrice {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("major_value")
    private String majorValue;

}
