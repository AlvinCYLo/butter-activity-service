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
public class Location {

    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("augmented_location")
    private AugmentedLocation augmentedLocation;
    @JsonProperty("within")
    private String within;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("address")
    private String address;

}
