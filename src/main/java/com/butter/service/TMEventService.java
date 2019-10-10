package com.butter.service;

import java.util.List;
import com.butter.model.ticketmaster.TMEvent;

public interface TMEventService {

    /**
	 * Finds events by given location
	 *
	 * @param location
	 * @return list of available events
	 */
	List<TMEvent> findEvents(String location);

}