package com.butter.service;

import java.util.Optional;

import com.butter.model.eventbrite.EventbriteResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eventbrite-service", url = "https://www.eventbriteapi.com/v3/events/")
public interface EventbriteService {

    @RequestMapping(method = RequestMethod.GET, value = "/search?location.latitude={lat}&location.longitude={lon}&start_date.range_start={start}&start_date.range_end={end}&categories={categoryId}&sort_by=date&expand=venue,ticket_availability&token=CNU2GMJSLLEHVKGII66O")
    EventbriteResponse discoverEBEvents(
        @PathVariable("lat") String lat,
        @PathVariable("lon") String lon,
        @PathVariable("start") Optional<String> start,
        @PathVariable("end") Optional<String> end,
        @PathVariable("categoryId") Optional<String> categoryId
        );
}