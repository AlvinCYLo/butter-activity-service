package com.butter.model.poi;

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
public class POI {

    @JsonProperty("name")
    private String name;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("url")
    private String url;

    @JsonProperty("classifications")
    private List<Classification> classifications;
    
    @JsonProperty("openingHours")
    private OpeningHours openingHours;

    @JsonProperty("timeZone")
    private POITimezone timezone;

}