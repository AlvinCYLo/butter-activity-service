
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

public class Venue {

    @JsonProperty("name")
    public String name;
    @JsonProperty("test")
    public Boolean test;
    @JsonProperty("url")
    public String url;
    @JsonProperty("postalCode")
    public String postalCode;
    @JsonProperty("timezone")
    public String timezone;
    @JsonProperty("city")
    public City city;
    @JsonProperty("state")
    public State state;
    @JsonProperty("country")
    public Country country;
    @JsonProperty("address")
    public Address address;
    @JsonProperty("location")
    public Location location;
    

}
