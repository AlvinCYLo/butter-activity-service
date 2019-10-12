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
public class POITime {

    @JsonProperty("date")
    private String date;

    @JsonProperty("hour")
    private Integer hour;

    @JsonProperty("minute")
    private Integer minute;

}