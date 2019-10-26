package com.butter.controller;

import java.util.List;

import com.butter.dto.model.ActivityDTO;
import com.butter.service.ActivityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @Autowired
    private static ActivityService activityService;

    @RequestMapping(path = "/api/activities/", method = RequestMethod.GET)
    public List<ActivityDTO> discoverActivities(@RequestParam (value = "lat") String lat, @RequestParam (value = "lon") String lon){
        return activityService.discoverActivities(lat, lon, "", "", "");
    }

    @RequestMapping(path = "/api/activities/", method = RequestMethod.GET)
    public List<ActivityDTO> discoverActivities(@RequestParam (value = "lat") String lat, @RequestParam (value = "lon") String lon, @RequestParam (value = "category") String category){
        return activityService.discoverActivities(lat, lon, category, "", "");
    }

    @RequestMapping(path = "/api/activities/", method = RequestMethod.GET)
    public List<ActivityDTO> discoverActivities(@RequestParam (value = "lat") String lat, @RequestParam (value = "lon") String lon, @RequestParam (value = "start") String start, @RequestParam (value = "end") String end){
        return activityService.discoverActivities(lat, lon, "", start, end);
    }

    @RequestMapping(path = "/api/activities/", method = RequestMethod.GET)
    public List<ActivityDTO> discoverActivities(@RequestParam (value = "lat") String lat, @RequestParam (value = "lon") String lon, @RequestParam (value = "category") String category, @RequestParam (value = "start") String start, @RequestParam (value = "end") String end){
        return activityService.discoverActivities(lat, lon, category, start, end);
    }

}