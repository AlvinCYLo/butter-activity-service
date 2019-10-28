
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

public class Classification {

    @JsonProperty("segment")
    public Segment segment;
    @JsonProperty("genre")
    public Genre genre;
    @JsonProperty("subGenre")
    public SubGenre subGenre;
    @JsonProperty("type")
    public Type type;
    @JsonProperty("subType")
    public SubType subType;
    

}
