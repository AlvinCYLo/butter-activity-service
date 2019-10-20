package com.butter.service;

import java.util.Optional;

import com.butter.model.ticketmaster.TicketmasterResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "tomtom-service", url = "https://api.tomtom.com/search/2/")
public interface TomtomService {

    @RequestMapping(method = RequestMethod.GET, value = "/poiSearch/{category}.json?lat={lat}&lon={lon}&openingHours={start}&language=en-US&limit=15&key=api0NlYioezCVwtBkk9n1bldLmbgjWWw")
    TicketmasterResponse discoverTTPOIs(
        @PathVariable("category") Optional<String> category,
        @PathVariable("lat") String lat,
        @PathVariable("lon") String lon,
        @PathVariable("start") Optional<String> start
        );
}