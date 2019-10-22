package com.butter.service;

import com.butter.constants.Constants;
import com.butter.model.ticketmaster.TicketmasterResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ticketmaster-service", url = Constants.TICKETMASTER_BASE_URL)
public interface TicketmasterService {

    @RequestMapping(method = RequestMethod.GET, value = "/events.json?latlong={lat},{lon}&keyword={category}&startDateTime={start}&endDateTime={end}&apikey=DXEoZW9TaG1mTemeRzKmxibm7UoxgmkB")
    TicketmasterResponse discoverTMEvents(
        @PathVariable("lat") String lat,
        @PathVariable("lon") String lon,
        @PathVariable("category") String category,
        @PathVariable("start") String start,
        @PathVariable("end") String end
        );
}