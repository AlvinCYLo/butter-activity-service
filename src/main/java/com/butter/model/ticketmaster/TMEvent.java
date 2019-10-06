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
public class TMEvent {

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;
    
    @JsonProperty("id")
    private String id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("sales")
    private Sales sales;

    @JsonProperty("dates")
    private EventDates dates;

    @JsonProperty("classifications")
    private List<Classification> classifications;

    @JsonProperty("_embedded")
    private VenueAndAttractions venueAndAttractions;

    @JsonProperty("priceRanges")
    private List<PriceLevel> priceRanges;

}