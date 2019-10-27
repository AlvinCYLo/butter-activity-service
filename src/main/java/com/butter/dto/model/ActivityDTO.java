package com.butter.dto.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter 
@Setter
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class ActivityDTO {

    @JsonProperty("name")
    private String name = "";

    @JsonProperty("url")
    private String url = "";

    @JsonProperty("address")
    private String address = "";

    @JsonProperty("latitude")
    private String latitude = "";

    @JsonProperty("longitude")
    private String longitude = "";

    @JsonProperty("start")
    private String start = "";

    @JsonProperty("end")
    private String end = "";

    @JsonProperty("minTicketPrice")
    private Integer minTicketPrice = 0;

    @JsonProperty("maxTicketPrice")
    private Integer maxTicketPrice = 0;

    @JsonProperty("salesStart")
    private String salesStart = "";

    @JsonProperty("salesEnd")
    private String salesEnd = "";

    @JsonProperty("city")
    private String city = "";

    @JsonProperty("stateCode")
    private String stateCode = "";

    @JsonProperty("countryCode")
    private String countryCode = "";
    
    @JsonProperty("classification")
    private List<String> classification;

    @JsonProperty("venueName")
    private String venueName = "";

    @JsonProperty("currency")
    private String currency = "";

    @JsonProperty("type")
    private String type = "";

}