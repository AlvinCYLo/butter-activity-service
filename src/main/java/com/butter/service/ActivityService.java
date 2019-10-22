package com.butter.service;

import java.util.List;

import com.butter.dto.model.ActivityDTO;

public interface ActivityService {

    List<ActivityDTO> discoverActivities(String lat, String lon, String category, String start, String end);

}