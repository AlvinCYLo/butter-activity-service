package com.butter.service;

import java.util.List;
import java.util.Optional;

import com.butter.model.ticketmaster.TicketmasterResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ticketmaster-service", url = "https://app.ticketmaster.com/discovery/v2/")
public interface TicketmasterService {

    @RequestMapping(method = RequestMethod.GET, value = "/events.json?latlong={lat},{lon}&keyword={category}&classificationName={categories}&startDateTime={start}&endDateTime={end}&apikey=DXEoZW9TaG1mTemeRzKmxibm7UoxgmkB")
    TicketmasterResponse discoverTMEvents(
        @PathVariable("lat") String lat,
        @PathVariable("lon") String lon,
        @PathVariable("category") Optional<String> category,
        @PathVariable("categories") Optional<List<String>> categories,
        @PathVariable("start") Optional<String> start,
        @PathVariable("end") Optional<String> end
        );
}