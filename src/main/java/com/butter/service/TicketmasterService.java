package com.butter.service;

import com.butter.model.ticketmaster.TicketmasterResponse;

import org.springframework.stereotype.Component;

@Component
public interface TicketmasterService {

    TicketmasterResponse discoverTMEvents(String lat, String lon, String category, String start, String end);
}