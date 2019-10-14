
package com.butter.model.ticketmaster;

import java.util.List;

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
public class Event {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("units")
    private String units;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("url")
    private String url;
    @JsonProperty("sales")
    private Sales sales;
    @JsonProperty("dates")
    private Dates dates;
    @JsonProperty("classifications")
    private List<Classification> classifications = null;
    @JsonProperty("priceRanges")
    private List<PriceRange> priceRanges = null;
    @JsonProperty("ticketLimit")
    private TicketLimit ticketLimit;
    @JsonProperty("_embedded")
    private Embedded_ embedded;
    
}
