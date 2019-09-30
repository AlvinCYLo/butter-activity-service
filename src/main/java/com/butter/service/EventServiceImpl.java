package com.butter.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import com.butter.model.event.Event;
import com.butter.model.event.EventBriteResult;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EventServiceImpl implements EventService {

    private static final String EVENTBRITE_BASE_URL = "https://www.eventbriteapi.com/v3/events";
    private static final String PRIVATE_TOKEN = "CNU2GMJSLLEHVKGII66O";
    private static final String DISTANCE = "10km";

    private static final RestTemplate template = new RestTemplate();

    @Override
    public List<Event> findEvents(String cityStateCountry) {
        EventBriteResult allEvents = template.getForObject(
            String.format("%s/search?location.address=%s&location.within=%s&sort_by=date&expand=venue&token=%s", 
            EVENTBRITE_BASE_URL,
            cityStateCountry,
            DISTANCE,
            PRIVATE_TOKEN),
            EventBriteResult.class);
        return allEvents.getAvailableEvents();
    }

    public List<Event> findEvents(Long latitude, Long longitude) {
        EventBriteResult allEvents = template.getForObject(
            String.format("%s/search?location.latitude=%d&location.longitude=%d&location.within=%s&sort_by=date&expand=venue&token=%s", 
            EVENTBRITE_BASE_URL,
            latitude,
            longitude,
            DISTANCE,
            PRIVATE_TOKEN),
            EventBriteResult.class);
        return allEvents.getAvailableEvents();
    }

    public List<Event> findEvents(String cityStateCountry, String category) {
        Integer categoryId = 0;
        EventBriteResult allEvents = template.getForObject(
            String.format("%s/search?location.address=%s&location.within=%s&categories=%d&sort_by=date&expand=venue&token=%s", 
            EVENTBRITE_BASE_URL,
            cityStateCountry,
            DISTANCE,
            categoryId,
            PRIVATE_TOKEN),
            EventBriteResult.class);
        return allEvents.getAvailableEvents();
    }

    public List<Event> findEvents(Long latitude, Long longitude, String category) {
        Integer categoryId = 0;
        EventBriteResult allEvents = template.getForObject(
            String.format("%s/search?location.latitude=%d&location.longitude=%d&categories=%d&location.within=%s&sort_by=date&expand=venue&token=%s", 
            EVENTBRITE_BASE_URL,
            latitude,
            longitude,
            categoryId,
            DISTANCE,
            PRIVATE_TOKEN),
            EventBriteResult.class);
        return allEvents.getAvailableEvents();
    }

    public List<Event> findEvents(Date startDate, Date endDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
        String start = dateFormat.format(startDate);
        String end = dateFormat.format(endDate);

        EventBriteResult allEvents = template.getForObject(
            String.format("%s/search?start_date.range_start=%s&start_date.range_end=%s&location.within=%s&sort_by=date&expand=venue&token=%s", 
            EVENTBRITE_BASE_URL,
            start,
            end,
            DISTANCE,
            PRIVATE_TOKEN),
            EventBriteResult.class);
        return allEvents.getAvailableEvents();
    };

    public List<Event> findEvents(Date startDate, Date endDate, String category){
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
        String start = dateFormat.format(startDate);
        String end = dateFormat.format(endDate);
        Integer categoryId = 0;

        EventBriteResult allEvents = template.getForObject(
            String.format("%s/search?start_date.range_start=%s&start_date.range_end=%s&categories=%d&location.within=%s&sort_by=date&expand=venue&token=%s", 
            EVENTBRITE_BASE_URL,
            start,
            end,
            categoryId,
            DISTANCE,
            PRIVATE_TOKEN),
            EventBriteResult.class);
        return allEvents.getAvailableEvents();
    };

    public List<Event> findEvents(String cityStateCountry, Date startDate, Date endDate, String category){
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
        String start = dateFormat.format(startDate);
        String end = dateFormat.format(endDate);
        Integer categoryId = 0;

        EventBriteResult allEvents = template.getForObject(
            String.format("%s/search?location.address=%s&start_date.range_start=%s&start_date.range_end=%s&categories=%d&location.within=%s&sort_by=date&expand=venue&token=%s", 
            EVENTBRITE_BASE_URL,
            cityStateCountry,
            start,
            end,
            categoryId,
            DISTANCE,
            PRIVATE_TOKEN),
            EventBriteResult.class);
        return allEvents.getAvailableEvents();
    };

    public List<Event> findEvents(Long latitude, Long longitude, Date startDate, Date endDate, String category){
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
        String start = dateFormat.format(startDate);
        String end = dateFormat.format(endDate);
        Integer categoryId = 0;

        EventBriteResult allEvents = template.getForObject(
            String.format("%s/search?location.latitude=%d&location.longitude=%d&start_date.range_start=%s&start_date.range_end=%s&categories=%d&location.within=%s&sort_by=date&expand=venue&token=%s", 
            EVENTBRITE_BASE_URL,
            latitude,
            longitude,
            start,
            end,
            categoryId,
            DISTANCE,
            PRIVATE_TOKEN),
            EventBriteResult.class);
        return allEvents.getAvailableEvents();
    };

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