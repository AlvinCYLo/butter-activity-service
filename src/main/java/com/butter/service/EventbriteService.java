package com.butter.service;

import com.butter.model.eventbrite.EventbriteResponse;

import org.springframework.stereotype.Component;

@Component
public interface EventbriteService {

    EventbriteResponse discoverEBEvents(String lat, String lon, String start, String end, String categoryId);

}