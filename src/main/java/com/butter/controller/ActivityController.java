package com.butter.controller;

import java.util.List;

import com.butter.dto.model.ActivityDTO;
import com.butter.service.ActivityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @RequestMapping(path = "/api/activities/?lat={lat}", method = RequestMethod.GET)
    public List<ActivityDTO> discoverActivities(@PathVariable String lat, @PathVariable String lon){
        return activityService.discoverActivities(lat, lon, "", "", "");
    }

    @RequestMapping(path = "/api/activities/?lat={lat}&lon={lon}&category={category}", method = RequestMethod.GET)
    public List<ActivityDTO> discoverActivities(@PathVariable String lat, @PathVariable String lon, @PathVariable String category){
        return activityService.discoverActivities(lat, lon, category, "", "");
    }

    @RequestMapping(path = "/api/activities/?lat={lat}&lon={lon}&start={start}&end={end}", method = RequestMethod.GET)
    public List<ActivityDTO> discoverActivities(@PathVariable String lat, @PathVariable String lon, @PathVariable String start, @PathVariable String end){
        return activityService.discoverActivities(lat, lon, "", start, end);
    }

    @RequestMapping(path = "/api/activities/?lat={lat}&lon={lon}&category={category}&start={start}&end={end}", method = RequestMethod.GET)
    public List<ActivityDTO> discoverActivities(@PathVariable String lat, @PathVariable String lon, @PathVariable String category, @PathVariable String start, @PathVariable String end){
        return activityService.discoverActivities(lat, lon, category, start, end);
    }

}