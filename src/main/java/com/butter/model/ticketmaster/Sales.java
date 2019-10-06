package com.butter.model.ticketmaster;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class Sales {

    @JsonProperty("public")
    private SaleTime publicSales;

    @JsonProperty("presales")
    private List<SaleTime> preSales;

}