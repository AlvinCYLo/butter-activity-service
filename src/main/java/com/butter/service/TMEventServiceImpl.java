package com.butter.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import com.butter.model.ticketmaster.TMEvent;
import com.butter.model.ticketmaster.TMEventResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TMEventServiceImpl implements TMEventService {

    private static final String TICKETMASTER_BASE_URL = "https://app.ticketmaster.com/discovery/v2/";
    private static final String API_KEY = "DXEoZW9TaG1mTemeRzKmxibm7UoxgmkB";

    private static final RestTemplate template = new RestTemplate();

    @Override
    public List<TMEvent> findEvents(String city){
        TMEventResponse allEvents = template.getForObject(
            String.format("%s.json?city=%s&apikey=%s",
            TICKETMASTER_BASE_URL,
            city,
            API_KEY),
            TMEventResponse.class);
        return allEvents.getAvailableEvents();
    }

    public List<TMEvent> findEvents(String city, String keyword){
        TMEventResponse allEvents = template.getForObject(
            String.format("%s.json?city=%s&keyword=%s&apikey=%s",
            TICKETMASTER_BASE_URL,
            city,
            keyword,
            API_KEY),
            TMEventResponse.class);
        return allEvents.getAvailableEvents();
    }

    public List<TMEvent> findEvents(String city, Date startDate, Date endDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
        String start = dateFormat.format(startDate);
        String end = dateFormat.format(endDate);

        TMEventResponse allEvents = template.getForObject(
            String.format("%s.json?city=%s&startDateTime=%s&endDateTime=%s&apikey=%s",
            TICKETMASTER_BASE_URL,
            city,
            start,
            end,
            API_KEY),
            TMEventResponse.class);
        return allEvents.getAvailableEvents();
    }

    public List<TMEvent> findEvents(String city, String keyword, Date startDate, Date endDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
        String start = dateFormat.format(startDate);
        String end = dateFormat.format(endDate);

        TMEventResponse allEvents = template.getForObject(
            String.format("%s.json?city=%s&keyword=%s&startDateTime=%s&endDateTime=%s&apikey=%s",
            TICKETMASTER_BASE_URL,
            city,
            keyword,
            start,
            end,
            API_KEY),
            TMEventResponse.class);
        return allEvents.getAvailableEvents();
    }

    // public List<TMEvent> findEvents(String keyword, Date startDate, Date endDate, Long latitude, Long longitude){
    //     SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
    //     String start = dateFormat.format(startDate);
    //     String end = dateFormat.format(endDate);

    //     TMEventResponse allEvents = template.getForObject(
    //         String.format("%s.json?city=%s&keyword=%s&startDateTime=%s&endDateTime=%s&apikey=%s",
    //         TICKETMASTER_BASE_URL,
    //         city,
    //         keyword,
    //         start,
    //         end,
    //         API_KEY),
    //         TMEventResponse.class);
    //     return allEvents.getAvailableEvents();
    // }

    // public List<TMEvent> findEvents(String keyword, Long latitude, Long longitude){
    //     TMEventResponse allEvents = template.getForObject(
    //         String.format("%s.json?city=%s&keyword=%s&__apikey=%s",
    //         TICKETMASTER_BASE_URL,
    //         city,
    //         keyword,
    //         API_KEY),
    //         TMEventResponse.class);
    //     return allEvents.getAvailableEvents();
    // }

    public List<TMEvent> findEvents(String city, List<String> classificationNames, Date startDate, Date endDate){
        String allClassifications = String.join(",", classificationNames);
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
        String start = dateFormat.format(startDate);
        String end = dateFormat.format(endDate);

        TMEventResponse allEvents = template.getForObject(
            String.format("%s.json?city=%s&classificationName=%s&startDateTime=%s&endDateTime=%s&apikey=%s",
            TICKETMASTER_BASE_URL,
            city,
            allClassifications,
            start,
            end,
            API_KEY),
            TMEventResponse.class);
        return allEvents.getAvailableEvents();
    }

    // public List<TMEvent> findEvents(List<String> classificationNames, Date startDate, Date endDate, Long latitude, Long longitude){
    //     String allClassifications = String.join(",", classificationNames);
    //     SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
    //     String start = dateFormat.format(startDate);
    //     String end = dateFormat.format(endDate);

    //     TMEventResponse allEvents = template.getForObject(
    //         String.format("%s.json?city=%s&classificationName=%s&startDateTime=%s&endDateTime=%s&apikey=%s",
    //         TICKETMASTER_BASE_URL,
    //         city,
    //         allClassifications,
    //         start,
    //         end,
    //         API_KEY),
    //         TMEventResponse.class);
    //     return allEvents.getAvailableEvents();
    // }

    public List<TMEvent> findEvents(String city, List<String> classificationNames){
        String allClassifications = String.join(",", classificationNames);

        TMEventResponse allEvents = template.getForObject(
            String.format("%s.json?city=%s&classificationName=%s&apikey=%s",
            TICKETMASTER_BASE_URL,
            city,
            allClassifications,
            API_KEY),
            TMEventResponse.class);
        return allEvents.getAvailableEvents();
    }

}