
package com.butter.model.poi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "municipality",
    "countrySubdivision",
    "countryCodeISO3",
    "freeformAddress",
    "countrySubdivisionName"
})
public class Address {

    @JsonProperty("municipality")
    private String municipality;
    @JsonProperty("countrySubdivision")
    private String countrySubdivision;
    @JsonProperty("countryCodeISO3")
    private String countryCodeISO3;
    @JsonProperty("freeformAddress")
    private String freeformAddress;
    @JsonProperty("countrySubdivisionName")
    private String countrySubdivisionName;
    
}
