
package com.butter.model.poi;

import java.util.List;
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
    "poi",
    "address",
    "position",
    "mapcodes",
    "viewport"
})
public class Result {

    @JsonProperty("poi")
    private Poi poi;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("mapcodes")
    private List<Mapcode> mapcodes = null;
    @JsonProperty("viewport")
    private Viewport viewport;
    
}
