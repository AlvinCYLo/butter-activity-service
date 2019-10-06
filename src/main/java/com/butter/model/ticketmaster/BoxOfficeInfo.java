package com.butter.model.ticketmaster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class BoxOfficeInfo {

    @JsonProperty("phoneNumberDetail")
    private String phoneNumber;

    @JsonProperty("openHoursDetail")
    private String openingHours;

    @JsonProperty("acceptedPaymentDetail")
    private String acceptedPayment;

}