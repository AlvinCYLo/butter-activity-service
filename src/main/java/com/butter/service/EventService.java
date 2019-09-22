package com.butter.service;
//eventbrite & ticketmaster

import java.util.List;
import com.butter.model.event.Event;

public interface EventService {

    /**
	 * Finds events by given location
	 *
	 * @param location
	 * @return list of available events
	 */
    List<Event> findEvents(String location);

    /**
	 * Finds details of an event by given event Id
	 *
	 * @param eventId
	 * @return event details
	 */
    Event findEventById(String eventId);
}