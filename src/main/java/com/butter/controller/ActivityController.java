package com.butter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @RequestMapping(path = "/activities/{city}", method = RequestMethod.GET)
    public List<TMEvent> getEventByCity(@PathVariable String city){
        return TMEventService.findEvents(city);
    }



}