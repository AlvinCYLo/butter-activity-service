package com.butter.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.butter.dto.model.ActivityDTO;
import com.butter.dto.model.DetailsDTO;

import com.butter.model.eventbrite.EBEvent;
import com.butter.model.ticketmaster.TMEvent;

public class ActivityMapper {
    public static ActivityDTO ebToActivityDTO(EBEvent ebEvent) {
        List<String> categories = new ArrayList<String>();
        categories.add(ebEvent.getCategory().getName());

        return new ActivityDTO()
                .setName(ebEvent.getName().getText())
                .setUrl(ebEvent.getUrl())
                .setAddress(ebEvent.getVenue().getAddress().getLocalizedAddressDisplay())
                .setLatitude(ebEvent.getVenue().getLatitude())
                .setLongitude(ebEvent.getVenue().getLongitude())
                .setDetails(new DetailsDTO()
                        .setStart(ebEvent.getStart().getUtc())
                        .setEnd(ebEvent.getEnd().getUtc())
                        .setMinTicketPrice(ebEvent.getTicketAvailability().getMinimumTicketPrice().getValue())
                        .setMaxTicketPrice(ebEvent.getTicketAvailability().getMaximumTicketPrice().getValue())
                        .setSalesStart(ebEvent.getTicketAvailability().getStartSalesDate().getUtc())
                        .setCity(ebEvent.getVenue().getAddress().getCity())
                        .setStateCode(ebEvent.getVenue().getAddress().getRegion())
                        .setCountryCode(ebEvent.getVenue().getAddress().getCountry())
                        .setClassification(categories)
                        .setVenueName(ebEvent.getVenue().getName())
                        .setCurrency(ebEvent.getTicketAvailability().getMinimumTicketPrice().getCurrency()));
    }

    public static ActivityDTO tmToActivityDTO(TMEvent tmEvent) {
        List<String> categories = new ArrayList<String>();
        categories.add(tmEvent.getClassifications().get(0).getSegment().getName());
        categories.add(tmEvent.getClassifications().get(0).getGenre().getName());

        return new ActivityDTO()
                .setName(tmEvent.getName())
                .setUrl(tmEvent.getUrl())
                .setAddress(tmEvent.getEmbedded().getVenues().get(0).getAddress().getLine1())
                .setLatitude(tmEvent.getLocation().getLatitude())
                .setLongitude(tmEvent.getLocation().getLongitude())
                .setDetails(new DetailsDTO()
                        .setStart(tmEvent.getDates().getStart().getDateTime())
                        .setEnd(tmEvent.getDates().getEnd().getDateTime())
                        .setMinTicketPrice(tmEvent.getPriceRanges().get(0).getMin().intValue())
                        .setMaxTicketPrice(tmEvent.getPriceRanges().get(0).getMax().intValue())
                        .setSalesStart(tmEvent.getSales().get_public().getStartDateTime())
                        .setSalesEnd(tmEvent.getSales().get_public().getEndDateTime())
                        .setCity(tmEvent.getEmbedded().getVenues().get(0).getCity().getName())
                        .setStateCode(tmEvent.getEmbedded().getVenues().get(0).getState().getStateCode())
                        .setCountryCode(tmEvent.getEmbedded().getVenues().get(0).getCountry().getCountryCode())
                        .setClassification(categories)
                        .setVenueName(tmEvent.getEmbedded().getVenues().get(0).getName())
                        .setCurrency(tmEvent.getPriceRanges().get(0).getCurrency()));
    }
}