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
public class VenueAndAttractions {

    @JsonProperty("venues")
    private List<Venue> venues;

    @JsonProperty("attractions")
    private List<Attraction> attractions;
    
}