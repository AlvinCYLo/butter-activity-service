package com.butter.service;
//eventbrite & ticketmaster

import java.util.List;
import com.butter.model.event.Event;

public interface EventService {

    /**
	 * Finds events by given location
	 *
	 * @param accountName
	 * @return list of available events
	 */
    List<Event> findEvents(String location);

}