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
public class DetailsDTO {

    @JsonProperty("start")
    private String start;

    @JsonProperty("end")
    private String end;

    @JsonProperty("minTicketPrice")
    private Integer minTicketPrice;

    @JsonProperty("maxTicketPrice")
    private Integer maxTicketPrice;

    @JsonProperty("salesStart")
    private String salesStart;

    @JsonProperty("salesEnd")
    private String salesEnd;

    @JsonProperty("city")
    private String city;

    @JsonProperty("stateCode")
    private String stateCode;

    @JsonProperty("countryCode")
    private String countryCode;
    
    @JsonProperty("classification")
    private List<String> classification;

    @JsonProperty("venueName")
    private String venueName;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("type")
    private String type;

}