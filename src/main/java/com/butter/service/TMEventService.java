package com.butter.service;

import java.util.List;

public interface TMEventService {

    /**
	 * Finds events by given location
	 *
	 * @param location
	 * @return list of available events
	 */
	List<> findEvents(String location);

}