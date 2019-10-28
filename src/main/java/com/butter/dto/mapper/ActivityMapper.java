package com.butter.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.butter.dto.model.ActivityDTO;
import com.butter.model.eventbrite.EBEvent;
import com.butter.model.poi.Result;
import com.butter.model.poi.TimeRange;
import com.butter.model.ticketmaster.TMEvent;

import org.springframework.stereotype.Component;

@Component
public class ActivityMapper {

    // public ActivityDTO ebToActivityDTO(EBEvent ebEvent) {
    //     List<String> categories = new ArrayList<String>();
    //     categories.add(ebEvent.getCategory().getName());

    //     return new ActivityDTO()
    //             .setName(ebEvent.getName().getText())
    //             .setUrl(ebEvent.getUrl())
    //             // .setAddress(ebEvent.getVenue().getAddress().getLocalizedAddressDisplay())
    //             // .setLatitude(ebEvent.getVenue().getLatitude())
    //             // .setLongitude(ebEvent.getVenue().getLongitude())
    //             .setDetails(new DetailsDTO()
    //                     // .setStart(ebEvent.getStart().getUtc())
    //                     // .setEnd(ebEvent.getEnd().getUtc())
    //                     // .setMinTicketPrice(ebEvent.getTicketAvailability().getMinimumTicketPrice().getValue())
    //                     // .setMaxTicketPrice(ebEvent.getTicketAvailability().getMaximumTicketPrice().getValue())
    //                     // .setSalesStart(ebEvent.getTicketAvailability().getStartSalesDate().getUtc())
    //                     // .setSalesEnd("")
    //                     // .setCity(ebEvent.getVenue().getAddress().getCity())
    //                     // .setStateCode(ebEvent.getVenue().getAddress().getRegion())
    //                     // .setCountryCode(ebEvent.getVenue().getAddress().getCountry())
    //                     // .setClassification(categories)
    //                     // .setVenueName(ebEvent.getVenue().getName())
    //                     // .setCurrency(ebEvent.getTicketAvailability().getMinimumTicketPrice().getCurrency())
    //                     .setType("Event"));
    // }

    public ActivityDTO tmToActivityDTO(TMEvent tmEvent) {
        List<String> categories = new ArrayList<String>();
        categories.add(tmEvent.getClassifications().get(0).getSegment().getName());
        categories.add(tmEvent.getClassifications().get(0).getGenre().getName());
        Integer minPrice = (tmEvent.getPriceRanges() != null) ? tmEvent.getPriceRanges().get(0).getMin().intValue() : 0;
        Integer maxPrice = (tmEvent.getPriceRanges() != null) ? tmEvent.getPriceRanges().get(0).getMax().intValue() : 0;
        String currency = (tmEvent.getPriceRanges() != null) ? tmEvent.getPriceRanges().get(0).getCurrency() : "CAD";
        
        return new ActivityDTO()
                .setName(tmEvent.getName())
                .setUrl(tmEvent.getUrl())
                .setAddress(tmEvent.getEmbedded().getVenues().get(0).getAddress().getLine1())
                .setLatitude(tmEvent.getEmbedded().getVenues().get(0).getLocation().getLatitude())
                .setLongitude(tmEvent.getEmbedded().getVenues().get(0).getLocation().getLongitude())
                .setStart(tmEvent.getDates().getStart().getDateTime())
                .setEnd("")
                .setMinTicketPrice(minPrice)
                .setMaxTicketPrice(maxPrice)
                .setSalesStart(tmEvent.getSales().get_public().getStartDateTime())
                .setSalesEnd(tmEvent.getSales().get_public().getEndDateTime())
                .setCity(tmEvent.getEmbedded().getVenues().get(0).getCity().getName())
                .setStateCode(tmEvent.getEmbedded().getVenues().get(0).getState().getStateCode())
                .setCountryCode(tmEvent.getEmbedded().getVenues().get(0).getCountry().getCountryCode())
                .setClassification(categories)
                .setVenueName(tmEvent.getEmbedded().getVenues().get(0).getName())
                .setCurrency(currency)
                .setType("Event");
    }

    public ActivityDTO ttToActivityDTO(Result ttPOI){
        String url = (ttPOI.getPoi().getUrl() != null) ? ttPOI.getPoi().getUrl() : "";
        TimeRange range = (ttPOI.getPoi().getOpeningHours() != null) ? ttPOI.getPoi().getOpeningHours().getTimeRanges().get(0) : null;
        String start = (range != null) ? String.format("%i:%i", range.getStartTime().getHour(), range.getStartTime().getMinute()) : "";
        String end = (range != null) ? String.format("%i:%i", range.getEndTime().getHour(), range.getEndTime().getMinute()) : "";
        return new ActivityDTO()
            .setName(ttPOI.getPoi().getName())
            // .setUrl(url)
            // .setAddress(ttPOI.getAddress().getFreeformAddress())
            // .setLatitude(String.valueOf(ttPOI.getPosition().getLat()))
            // .setLongitude(String.valueOf(ttPOI.getPosition().getLon()))
            // .setStart(start)
            // .setEnd(end)
            // .setMinTicketPrice(0)
            // .setMaxTicketPrice(0)
            // .setSalesStart("")
            // .setSalesEnd("")
            // .setCity(ttPOI.getAddress().getMunicipality())
            // .setStateCode(ttPOI.getAddress().getCountrySubdivision())
            // .setCountryCode(ttPOI.getAddress().getCountryCodeISO3())
            // .setClassification(ttPOI.getPoi().getCategories())
            // .setVenueName(ttPOI.getPoi().getName())
            .setType("POI");
    }
}