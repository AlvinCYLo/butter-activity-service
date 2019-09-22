package com.butter.model.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class Event {

    private Name name;

    private String id;

    private String url;

    private EventTime start;

    private EventTime end;
    
    private String status;

    private Boolean is_free;

    private String venue_id;

    private String category_id;

    private String subcategory_id;

    private String format_id;
    
    @Override
    public String toString() {
        return name.getText();
    }
}