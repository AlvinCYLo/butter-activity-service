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
public class Event {

    @JsonProperty("name")
    private Name name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("start")
    private Start start;
    @JsonProperty("end")
    private End end;
    @JsonProperty("capacity")
    private Integer capacity;
    @JsonProperty("status")
    private String status;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("is_free")
    private Boolean isFree;
    @JsonProperty("resource_uri")
    private String resourceUri;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("ticket_availability")
    private TicketAvailability ticketAvailability;

}
