package com.butter.service;

import java.util.List;
import com.butter.model.event.Event;
import com.butter.model.event.EventBriteSearchResult;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EventServiceImpl implements EventService {

    private static final String EVENTBRITE_BASE_URL = "https://www.eventbriteapi.com/v3/events";
    private static final String PRIVATE_TOKEN = "CNU2GMJSLLEHVKGII66O";
    
    private static final RestTemplate template = new RestTemplate();

    @Override
    public List<Event> findEvents(String location) {
        EventBriteSearchResult allEvents = template.getForObject(
            String.format("%s/search?location.address=vancovuer&location.within=10km&token=%s", 
            EVENTBRITE_BASE_URL,
            PRIVATE_TOKEN),
                EventBriteSearchResult.class);
        return allEvents.getAvailableEvents();
    }

    @Override
    public Event findEventById(String eventId) {
        Event event = template.getForObject(
            String.format("%s/%s/?token=%S", eventId, 
            EVENTBRITE_BASE_URL,
            PRIVATE_TOKEN), 
        Event.class);
        return event;
    }
    
}