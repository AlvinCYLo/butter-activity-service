
package com.butter.model.poi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Poi {

    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("url")
    private String url;
    @JsonProperty("openingHours")
    private OpeningHours openingHours;
    @JsonProperty("categories")
    private List<String> categories;
    @JsonProperty("classifications")
    private List<Classification> classifications = null;
    @JsonProperty("timeZone")
    private TimeZone timeZone;
    
}
