package com.butter.controller;

import java.util.List;

import com.butter.model.eventbrite.EBEvent;
import com.butter.service.EBEventService;
import com.butter.service.TMEventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @Autowired
    private EBEventService EBEventService;
    private TMEventService TMEventService;

    // @RequestMapping(path = "/events/{city}", method = RequestMethod.GET)
    // public List<EBEvent> getEventByCity(@PathVariable String city){
    //     return EBEventService.findEvents(city);
    // }

    @RequestMapping("/test")
    public String index(){
        return "Hello World";
    }

}