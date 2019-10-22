package com.butter.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.butter.dto.mapper.ActivityMapper;
import com.butter.dto.model.ActivityDTO;
import com.butter.model.eventbrite.EBEvent;
import com.butter.model.eventbrite.EventbriteResponse;
import com.butter.model.eventbrite.category.Category;
import com.butter.model.eventbrite.category.EBCategoryResponse;
import com.butter.model.poi.Result;
import com.butter.model.poi.TomtomPOIResponse;
import com.butter.model.ticketmaster.TMEvent;
import com.butter.model.ticketmaster.TicketmasterResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ActivityServiceImpl implements ActivityService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private EventbriteService ebService;

    @Autowired
    private TicketmasterService tmService;

    @Autowired
    private TomtomService ttService;


    @Override
    public List<ActivityDTO> discoverActivities(String lat, String lon, String category, String start, String end) {
        List<ActivityDTO> availableActivities = new ArrayList<ActivityDTO>();
        
        String categoryId = getCategoryId(category);

        EventbriteResponse ebActivities = ebService.discoverEBEvents(lat, lon, start, end, categoryId);
        TicketmasterResponse tmActivities = tmService.discoverTMEvents(lat, lon, category, start, end);
        TomtomPOIResponse ttActivities = ttService.discoverTTPOIs(category, lat, lon, start);

        for(EBEvent ebEvent : ebActivities.getEvents()){
            availableActivities.add(ActivityMapper.ebToActivityDTO(ebEvent));
        }

        for(TMEvent tmEvent : tmActivities.getEmbedded().getEvents()){
            availableActivities.add(ActivityMapper.tmToActivityDTO(tmEvent));
        }

        for(Result ttPOI : ttActivities.getResults()){
            availableActivities.add(ActivityMapper.ttToActivityDTO(ttPOI));
        }

        log.info("Activities from Eventbrite, TicketMaster and Tomtom have been successfully retrieved");
        return availableActivities;

    }

    private String getCategoryId(String category) {
        Map<String, Category> ebCategories = new HashMap<String, Category>();

        EBCategoryResponse ebCategoryResponse = ebService.getEBCategories("");
        while (ebCategoryResponse.getPagination().getHas_more_items() && ebCategoryResponse.getCategories().size() > 0) {
            for (Category cat : ebCategoryResponse.getCategories()) {
                ebCategories.put(cat.getName(), cat);
            }
            ebCategoryResponse = ebService.getEBCategories(ebCategoryResponse.getPagination().getContinuation());
        }

        Set<String> categoryKeys = ebCategories.keySet();
        for(String key : categoryKeys){
            if(key.toLowerCase().equals(category.toLowerCase())){
                return ebCategories.get(key).getParentCategory().getId();
            }
        }
        return "";
    }

}