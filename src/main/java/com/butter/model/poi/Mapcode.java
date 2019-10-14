
package com.butter.model.poi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mapcode {

    @JsonProperty("type")
    private String type;
    @JsonProperty("fullMapcode")
    private String fullMapcode;
    @JsonProperty("territory")
    private String territory;
    @JsonProperty("code")
    private String code;
    
}
