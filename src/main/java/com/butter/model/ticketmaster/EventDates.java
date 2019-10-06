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
public class EventDates {

    @JsonProperty("start")
    private EventTime start;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("status")
    private EventStatus status;
    
    @JsonProperty("end")
    private EventTime end;
    
}