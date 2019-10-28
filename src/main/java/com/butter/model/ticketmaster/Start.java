
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

public class Start {

    @JsonProperty("localDate")
    public String localDate;
    @JsonProperty("localTime")
    public String localTime;
    @JsonProperty("dateTime")
    public String dateTime;
    

}
