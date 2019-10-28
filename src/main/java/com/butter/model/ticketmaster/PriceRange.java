
package com.butter.model.ticketmaster;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class PriceRange {

    @JsonProperty("type")
    public String type;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("min")
    public Double min;
    @JsonProperty("max")
    public Double max;
    

}
