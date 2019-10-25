package com.butter.service;

import com.butter.constants.Constants;
import com.butter.model.ticketmaster.TicketmasterResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TicketmasterServiceImpl implements TicketmasterService {

    private static final RestTemplate template = new RestTemplate();

	@Override
	public TicketmasterResponse discoverTMEvents(String lat, String lon, String category, String start, String end) {
		TicketmasterResponse tmEvents = template.getForObject(
            String.format("%slatlong=%s&keyword=%s&startDateTime=%s&endDateTime=%s&apikey=%s", 
            Constants.TICKETMASTER_BASE_URL,
            lat + "," + lon,
            category,
            start,
            end,
            Constants.TICKETMASTER_API_KEY), 
            TicketmasterResponse.class);

        return tmEvents;
	}
    
}