
package com.butter.model.ticketmaster;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter 
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Venue {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("units")
    private String units;
    @JsonProperty("test")
    private Boolean test;
    @JsonProperty("url")
    private String url;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("city")
    private City city;
    @JsonProperty("state")
    private State state;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("location")
    private Location_ location;
    
}
