package com.butter.service;

import com.butter.constants.Constants;
import com.butter.model.eventbrite.EventbriteResponse;
import com.butter.model.eventbrite.category.EBCategoryResponse;

import org.springframework.web.client.RestTemplate;


public class EventbriteServiceImpl implements EventbriteService {

    private static final RestTemplate template = new RestTemplate();

    @Override
    public EventbriteResponse discoverEBEvents(String lat, String lon, String start, String end, String categoryId) {
        EventbriteResponse ebEvents = template.getForObject(
            String.format("%s/search?location.latitude=%s&location.longitude=%s&start_date.range_start=%s&start_date.range_end=%s&categories=%s&sort_by=date&expand=venue,ticket_availability&token=%s", 
            Constants.EVENTBRITE_BASE_URL,
            lat, 
            lon,
            start,
            end,
            categoryId,
            Constants.EVENTBRITE_API_KEY), 
            EventbriteResponse.class);

        return ebEvents;
    }

    @Override
    public EBCategoryResponse getEBCategories(String contToken) {
        EBCategoryResponse ebCategories = template.getForObject(
            String.format("%s/subcategories/?continuation=%s&token=%s",
            Constants.EVENTBRITE_BASE_URL,
            contToken,
            Constants.EVENTBRITE_API_KEY), 
            EBCategoryResponse.class);
            
        return ebCategories;
    }
    
}