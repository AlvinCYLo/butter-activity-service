package com.butter.service;

import com.butter.model.eventbrite.EventbriteResponse;
import com.butter.model.eventbrite.category.EBCategoryResponse;

import org.springframework.stereotype.Service;

@Service
public interface EventbriteService {

    EventbriteResponse discoverEBEvents(String lat, String lon, String start, String end, String categoryId);

    EBCategoryResponse getEBCategories(String contToken);

}