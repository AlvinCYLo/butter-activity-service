
package com.butter.model.ticketmaster;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class TMEvent {

    @JsonProperty("name")
    public String name = "";
    @JsonProperty("url")
    public String url = "";
    @JsonProperty("sales")
    public Sales sales;
    @JsonProperty("dates")
    public Dates dates;
    @JsonProperty("classifications")
    public List<Classification> classifications;
    @JsonProperty("priceRanges")
    public List<PriceRange> priceRanges;
    @JsonProperty("_embedded")
    public Embedded_ embedded;
    

}
