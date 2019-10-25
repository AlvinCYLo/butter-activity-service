package com.butter.service;

import com.butter.model.ticketmaster.TicketmasterResponse;

public interface TicketmasterService {

    TicketmasterResponse discoverTMEvents(String lat, String lon, String category, String start, String end);
}