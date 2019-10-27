package com.butter.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.butter.dto.model.ActivityDTO;
import com.butter.model.eventbrite.EBEvent;
import com.butter.model.poi.Result;
import com.butter.model.poi.TimeRange;
import com.butter.model.ticketmaster.TMEvent;

import org.modelmapper.Condition;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

@Component
public class ActivityMapper {

    private static Condition notNull = ctx -> ctx.getSource() != null;

    public ModelMapper configureTMMapping(){
        ModelMapper modelMapper = new ModelMapper();
        TypeMap<TMEvent, ActivityDTO> tmTypeMap = modelMapper.createTypeMap(TMEvent.class, ActivityDTO.class);
        addTMToActivityMapping(tmTypeMap);
        return modelMapper;
    }

    public ModelMapper configureEBMapping(){
        ModelMapper modelMapper = new ModelMapper();
        TypeMap<EBEvent, ActivityDTO> ebTypeMap = modelMapper.createTypeMap(EBEvent.class, ActivityDTO.class);
        addEBToActivityMapping(ebTypeMap);
        return modelMapper;
    }

    public ModelMapper configureTTMapping(){
        ModelMapper modelMapper = new ModelMapper();
        TypeMap<Result, ActivityDTO> poiTypeMap = modelMapper.createTypeMap(Result.class, ActivityDTO.class);
        addTTToActivityMapping(poiTypeMap);
        return modelMapper;
    }

    private void addEBToActivityMapping(TypeMap<EBEvent, ActivityDTO> ebTypeMap) {
        ebTypeMap.addMappings(mapper -> {
            mapper.when(notNull).map(src -> src.getName().getText(), ActivityDTO::setName);
            mapper.when(notNull).map(src -> src.getUrl(), ActivityDTO::setUrl);
            // mapper.when(notNull).map(src -> src.getVenue().getAddress().getLocalizedAddressDisplay(), ActivityDTO::setAddress);
            // mapper.when(notNull).map(src -> src.getVenue().getLatitude(), ActivityDTO::setLatitude);
            // mapper.when(notNull).map(src -> src.getVenue().getLongitude(), ActivityDTO::setLongitude);
            // mapper.when(notNull).map(src -> src.getEnd().getUtc(), ActivityDTO::setStart);
            // mapper.when(notNull).map(src -> src.getTicketAvailability().getMinimumTicketPrice().getValue(), ActivityDTO::setMinTicketPrice);
            // mapper.when(notNull).map(src -> src.getTicketAvailability().getMaximumTicketPrice().getValue(), ActivityDTO::setMaxTicketPrice);
            // mapper.when(notNull).map(src -> src.getTicketAvailability().getStartSalesDate().getUtc(), ActivityDTO::setSalesStart);
            // mapper.when(notNull).map(src -> "", ActivityDTO::setUrl);
            // mapper.when(notNull).map(src -> src.getVenue().getAddress().getCity(), ActivityDTO::setCity);
            // mapper.when(notNull).map(src -> src.getVenue().getAddress().getRegion(), ActivityDTO::setStateCode);
            // mapper.when(notNull).map(src-> src.getVenue().getAddress().getCountry(), ActivityDTO::setCountryCode);
            // mapper.when(notNull).map(src -> new String[]{src.getCategory().getName()}, ActivityDTO::setClassification);
            // mapper.when(notNull).map(src -> src.getVenue().getName(), ActivityDTO::setVenueName);
            // mapper.when(notNull).map(src -> src.getTicketAvailability().getMinimumTicketPrice().getCurrency(), ActivityDTO::setCurrency);
            mapper.when(notNull).map(src -> "EVENT", ActivityDTO::setType);
        });    
    }

    private void addTMToActivityMapping(TypeMap<TMEvent, ActivityDTO> tmTypeMap) {
        tmTypeMap.addMappings(mapper -> {
            mapper.when(notNull).map(src -> src.getName(), ActivityDTO::setName);
            mapper.when(notNull).map(src -> src.getUrl(), ActivityDTO::setUrl);
            // mapper.when(notNull).map(src -> src.getEmbedded().getVenues().get(0).getAddress().getLine1(), ActivityDTO::setAddress);
            // mapper.when(notNull).map(src -> src.getLocation().getLatitude(), ActivityDTO::setLatitude);
            // mapper.when(notNull).map(src -> src.getLocation().getLongitude(), ActivityDTO::setLongitude);
            // mapper.when(notNull).map(src -> src.getDates().getStart().getDateTime(), ActivityDTO::setStart);
            // mapper.when(notNull).map(src -> src.getDates().getEnd().getDateTime(), ActivityDTO::setEnd);
            // mapper.when(notNull).map(src -> src.getPriceRanges().get(0).getMin().intValue(), ActivityDTO::setMinTicketPrice);
            // mapper.when(notNull).map(src -> src.getPriceRanges().get(0).getMax().intValue(), ActivityDTO::setMaxTicketPrice);
            // mapper.when(notNull).map(src -> src.getSales().get_public().getStartDateTime(), ActivityDTO::setSalesStart);
            // mapper.when(notNull).map(src -> src.getSales().get_public().getEndDateTime(), ActivityDTO::setSalesEnd);
            // mapper.when(notNull).map(src -> src.getEmbedded().getVenues().get(0).getCity().getName(), ActivityDTO::setCity);
            // mapper.when(notNull).map(src -> src.getEmbedded().getVenues().get(0).getState().getStateCode(), ActivityDTO::setStateCode);
            // mapper.when(notNull).map(src -> src.getEmbedded().getVenues().get(0).getCountry().getCountryCode(), ActivityDTO::setCountryCode);
            // mapper.when(notNull).map(src -> new String[]{src.getClassifications().get(0).getSegment().getName(), src.getClassifications().get(0).getGenre().getName()}, ActivityDTO::setClassification);
            // mapper.when(notNull).map(src -> src.getEmbedded().getVenues().get(0).getName(), ActivityDTO::setVenueName);
            // mapper.when(notNull).map(src -> src.getPriceRanges().get(0).getCurrency(), ActivityDTO::setCurrency);
            mapper.map(src -> "EVENT", ActivityDTO::setType);
        });
    }

    private void addTTToActivityMapping(TypeMap<Result, ActivityDTO> poiTypeMap){
        poiTypeMap.addMappings(mapper -> {
            mapper.when(notNull).map(src -> src.getPoi().getName(), ActivityDTO::setName);
            mapper.when(notNull).map(src -> src.getPoi().getUrl(), ActivityDTO::setUrl);
            // mapper.when(notNull).map(src -> src.getAddress().getFreeformAddress(), ActivityDTO::setAddress);
            // mapper.when(notNull).map(src -> String.valueOf(src.getPosition().getLon()), ActivityDTO::setLatitude);
            // mapper.when(notNull).map(src -> String.valueOf(src.getPosition().getLat()), ActivityDTO::setLongitude);
            // mapper.when(notNull).map(src -> String.format("%i:%i", src.getPoi().getOpeningHours().getTimeRanges().get(0).getStartTime().getHour(), src.getPoi().getOpeningHours().getTimeRanges().get(0).getStartTime().getMinute()), ActivityDTO::setStart);
            // mapper.when(notNull).map(src -> String.format("%i:%i", src.getPoi().getOpeningHours().getTimeRanges().get(0).getEndTime().getHour(), src.getPoi().getOpeningHours().getTimeRanges().get(0).getEndTime().getMinute()), ActivityDTO::setEnd);
            // mapper.when(notNull).map(src -> 0, ActivityDTO::setMinTicketPrice);
            // mapper.when(notNull).map(src -> 0, ActivityDTO::setMaxTicketPrice);
            // mapper.when(notNull).map(src -> "", ActivityDTO::setSalesStart);
            // mapper.when(notNull).map(src -> "", ActivityDTO::setSalesEnd);
            // mapper.when(notNull).map(src -> src.getAddress().getMunicipality(), ActivityDTO::setCity);
            // mapper.when(notNull).map(src -> src.getAddress().getCountrySubdivision(), ActivityDTO::setStateCode);
            // mapper.when(notNull).map(src -> src.getAddress().getCountryCodeISO3(), ActivityDTO::setCountryCode);
            // mapper.when(notNull).map(src -> src.getPoi().getCategories(), ActivityDTO::setClassification);
            // mapper.when(notNull).map(src -> src.getPoi().getName(), ActivityDTO::setVenueName);
            // mapper.when(notNull).map(src -> "", ActivityDTO::setCurrency);
            mapper.when(notNull).map(src -> "POI", ActivityDTO::setType);
        });
    }

}