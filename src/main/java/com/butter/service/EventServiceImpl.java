package com.butter.service;

import java.util.List;
import com.butter.model.event.Event;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EventServiceImpl implements EventService {

    private static final RestTemplate template = new RestTemplate();

    @Override
    public List<Event> findEvents(String location) {

        return null;
    }

    @Override
    public Event findEventById(String eventId) {
        Event event = template.getForObject(String.format("https://www.eventbriteapi.com/v3/events/%s/?token=CNU2GMJSLLEHVKGII66O", eventId), Event.class);
        return event;
    }
    
}