package com.butter.model.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class Event {

    @JsonProperty("name")
    private Name name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("start")
    private EventTime startTime;

    @JsonProperty("end")
    private EventTime endTime;
    
    @JsonProperty("status")
    private String status;

    @JsonProperty("is_free")
    private Boolean free;

    @JsonProperty("venue_id")
    private String venue;

    @JsonProperty("category_id")
    private String category;

    @JsonProperty("subcategory_id")
    private String subcategory;

    @JsonProperty("format_id")
    private String format;
    
    @Override
    public String toString() {
        return name.getName() + startTime.getUtc() + endTime.getUtc();
    }
}