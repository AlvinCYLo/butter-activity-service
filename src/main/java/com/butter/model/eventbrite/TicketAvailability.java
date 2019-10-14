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
public class TicketAvailability {

    @JsonProperty("has_available_tickets")
    private Boolean hasAvailableTickets;
    @JsonProperty("minimum_ticket_price")
    private MinimumTicketPrice minimumTicketPrice;
    @JsonProperty("maximum_ticket_price")
    private MaximumTicketPrice maximumTicketPrice;
    @JsonProperty("is_sold_out")
    private Boolean isSoldOut;
    @JsonProperty("start_sales_date")
    private StartSalesDate startSalesDate;

}
