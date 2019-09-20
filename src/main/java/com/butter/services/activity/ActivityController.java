package com.butter.services.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

public class ActivityController {

    private static final Logger log = LoggerFactory.getLogger(ActivityController.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Event event = restTemplate.getForObject("https://www.eventbriteapi.com/v3/events/38448288867/?token=CNU2GMJSLLEHVKGII66O", Event.class);
        log.info(event.toString());
    }

}