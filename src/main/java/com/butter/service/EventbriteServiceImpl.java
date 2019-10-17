// package com.butter.service;

// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.List;
// import com.butter.model.eventbrite.EBEvent;
// import com.butter.model.eventbrite.EventbriteResponse;

// import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;

// @Service
// public class EBEventServiceImpl implements EBEventService {

//     private static final String EVENTBRITE_BASE_URL = "https://www.eventbriteapi.com/v3/events";
//     private static final String PRIVATE_TOKEN = "CNU2GMJSLLEHVKGII66O";
//     private static final String DISTANCE = "10km";

//     private static final RestTemplate template = new RestTemplate();

//     public List<EBEvent> findEvents(String cityStateCountry) {
//         EventbriteResponse allEvents = template.getForObject(
//             String.format("%s/search?location.address=%s&location.within=%s&sort_by=date&expand=venue,ticket_availability,category&token=%s", 
//             EVENTBRITE_BASE_URL,
//             cityStateCountry,
//             DISTANCE,
//             PRIVATE_TOKEN),
//             EventbriteResponse.class);
//         return allEvents.getAvailableEvents();
//     }

//     public List<EBEvent> findEvents(Long latitude, Long longitude) {
//         EventbriteResponse allEvents = template.getForObject(
//             String.format("%s/search?location.latitude=%d&location.longitude=%d&location.within=%s&sort_by=date&expand=venue,ticket_availability&token=%s", 
//             EVENTBRITE_BASE_URL,
//             latitude,
//             longitude,
//             DISTANCE,
//             PRIVATE_TOKEN),
//             EventbriteResponse.class);
//         return allEvents.getAvailableEvents();
//     }

//     public List<EBEvent> findEvents(String cityStateCountry, String category) {
//         Integer categoryId = 0;
//         EventbriteResponse allEvents = template.getForObject(
//             String.format("%s/search?location.address=%s&location.within=%s&categories=%d&sort_by=date&expand=venue,ticket_availability&token=%s", 
//             EVENTBRITE_BASE_URL,
//             cityStateCountry,
//             DISTANCE,
//             categoryId,
//             PRIVATE_TOKEN),
//             EventbriteResponse.class);
//         return allEvents.getAvailableEvents();
//     }

//     public List<EBEvent> findEvents(Long latitude, Long longitude, String category) {
//         Integer categoryId = 0;
//         EventbriteResponse allEvents = template.getForObject(
//             String.format("%s/search?location.latitude=%d&location.longitude=%d&categories=%d&location.within=%s&sort_by=date&expand=venue,ticket_availability&token=%s", 
//             EVENTBRITE_BASE_URL,
//             latitude,
//             longitude,
//             categoryId,
//             DISTANCE,
//             PRIVATE_TOKEN),
//             EventbriteResponse.class);
//         return allEvents.getAvailableEvents();
//     }

//     public List<EBEvent> findEvents(Date startDate, Date endDate){
//         SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
//         String start = dateFormat.format(startDate);
//         String end = dateFormat.format(endDate);

//         EventbriteResponse allEvents = template.getForObject(
//             String.format("%s/search?start_date.range_start=%s&start_date.range_end=%s&location.within=%s&sort_by=date&expand=venue,ticket_availability&token=%s", 
//             EVENTBRITE_BASE_URL,
//             start,
//             end,
//             DISTANCE,
//             PRIVATE_TOKEN),
//             EventbriteResponse.class);
//         return allEvents.getAvailableEvents();
//     };

//     public List<EBEvent> findEvents(Date startDate, Date endDate, String category){
//         SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
//         String start = dateFormat.format(startDate);
//         String end = dateFormat.format(endDate);
//         Integer categoryId = 0;

//         EventbriteResponse allEvents = template.getForObject(
//             String.format("%s/search?start_date.range_start=%s&start_date.range_end=%s&categories=%d&location.within=%s&sort_by=date&expand=venue,ticket_availability&token=%s", 
//             EVENTBRITE_BASE_URL,
//             start,
//             end,
//             categoryId,
//             DISTANCE,
//             PRIVATE_TOKEN),
//             EventbriteResponse.class);
//         return allEvents.getAvailableEvents();
//     };

//     public List<EBEvent> findEvents(String cityStateCountry, Date startDate, Date endDate, String category){
//         SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
//         String start = dateFormat.format(startDate);
//         String end = dateFormat.format(endDate);
//         Integer categoryId = 0;

//         EventbriteResponse allEvents = template.getForObject(
//             String.format("%s/search?location.address=%s&start_date.range_start=%s&start_date.range_end=%s&categories=%d&location.within=%s&sort_by=date&expand=venue,ticket_availability&token=%s", 
//             EVENTBRITE_BASE_URL,
//             cityStateCountry,
//             start,
//             end,
//             categoryId,
//             DISTANCE,
//             PRIVATE_TOKEN),
//             EventbriteResponse.class);
//         return allEvents.getAvailableEvents();
//     };

//     public List<EBEvent> findEvents(Long latitude, Long longitude, Date startDate, Date endDate, String category){
//         SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
//         String start = dateFormat.format(startDate);
//         String end = dateFormat.format(endDate);
//         Integer categoryId = 0;

//         EventbriteResponse allEvents = template.getForObject(
//             String.format("%s/search?location.latitude=%d&location.longitude=%d&start_date.range_start=%s&start_date.range_end=%s&categories=%d&location.within=%s&sort_by=date&expand=venue,ticket_availability&token=%s", 
//             EVENTBRITE_BASE_URL,
//             latitude,
//             longitude,
//             start,
//             end,
//             categoryId,
//             DISTANCE,
//             PRIVATE_TOKEN),
//             EventbriteResponse.class);
//         return allEvents.getAvailableEvents();
//     };

//     @Override
//     public EBEvent findEventById(String eventId) {
//         EBEvent event = template.getForObject(
//             String.format("%s/%s/?token=%S", eventId, 
//             EVENTBRITE_BASE_URL,
//             PRIVATE_TOKEN), 
//             EBEvent.class);
//         return event;
//     }
    
// }