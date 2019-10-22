package com.butter.service;

import com.butter.constants.Constants;
import com.butter.model.poi.TomtomPOIResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "tomtom-service", url = Constants.TOMTOM_BASE_URL)
public interface TomtomService {

    @RequestMapping(method = RequestMethod.GET, value = "/poiSearch/{category}.json?lat={lat}&lon={lon}&openingHours=nextSevenDays&language=en-US&limit=15&key=api0NlYioezCVwtBkk9n1bldLmbgjWWw")
    TomtomPOIResponse discoverTTPOIs(
        @PathVariable("category") String category,
        @PathVariable("lat") String lat,
        @PathVariable("lon") String lon,
        @PathVariable("start") String start
        );
}