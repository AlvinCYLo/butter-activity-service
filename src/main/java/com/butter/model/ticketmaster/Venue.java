package com.butter.model.ticketmaster;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class Venue {

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("id")
    private String id;

    @JsonProperty("url")
    private String url;
    
    @JsonProperty("postalCode")
    private String postalCode;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("city")
    private City city;

    @JsonProperty("state")
    private State state;

    @JsonProperty("country")
    private Country country;

    @JsonProperty("address")
    private Address address;
    
    @JsonProperty("location")
    private Location location;

    @JsonProperty("boxOfficeInfo")
    private BoxOfficeInfo boxOfficeInfo;
    
    @JsonProperty("parkingDetail")
    private String parkingDetail;
    
}