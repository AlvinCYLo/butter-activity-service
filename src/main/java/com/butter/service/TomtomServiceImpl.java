package com.butter.service;

import com.butter.constants.Constants;
import com.butter.model.poi.TomtomPOIResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TomtomServiceImpl implements TomtomService {

    private static final RestTemplate template = new RestTemplate();

	@Override
	public TomtomPOIResponse discoverTTPOIs(String category, String lat, String lon) {
		TomtomPOIResponse ttPOIs = template.getForObject(
            String.format("%s%s.json?lat=%s&lon=%s&openingHours=nextSevenDays&language=en-US&limit=15&key=%s", 
            Constants.TOMTOM_BASE_URL,
            category,
            lat,
            lon,
            Constants.TOMTOM_API_KEY), 
            TomtomPOIResponse.class);

        return ttPOIs;
	}
    
}