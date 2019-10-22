package com.butter.service;

import com.butter.constants.Constants;
import com.butter.model.eventbrite.EventbriteResponse;
import com.butter.model.eventbrite.category.EBCategoryResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eventbrite-service", url = Constants.EVENTBRITE_BASE_URL)
public interface EventbriteService {

    @RequestMapping(method = RequestMethod.GET, value = "/search?location.latitude={lat}&location.longitude={lon}&start_date.range_start={start}&start_date.range_end={end}&categories={categoryId}&sort_by=date&expand=venue,ticket_availability&token=CNU2GMJSLLEHVKGII66O")
    EventbriteResponse discoverEBEvents(
        @PathVariable("lat") String lat,
        @PathVariable("lon") String lon,
        @PathVariable("start") String start,
        @PathVariable("end") String end,
        @PathVariable("categoryId") String categoryId
        );
    
    @RequestMapping(method = RequestMethod.GET, value = "/subcategories/?continuation={contToken}&token=CNU2GMJSLLEHVKGII66O")
    EBCategoryResponse getEBCategories(
        @PathVariable("contToken") String contToken
    );

}