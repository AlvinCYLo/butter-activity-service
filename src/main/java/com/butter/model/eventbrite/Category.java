package com.butter.model.eventbrite;

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
public class Category {

    @JsonProperty("name")
    private String name;
    @JsonProperty("name_localized")
    private String name_localized;
    @JsonProperty("short_name")
    private String short_name;
}
