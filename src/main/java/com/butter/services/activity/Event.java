package com.butter.services.activity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

    public Event (){

    }

    @Getter @Setter
    private Name name;

    @Getter @Setter
    private String id;

    @Getter @Setter
    private String url;

    @Getter @Setter
    private Timing start;

    @Getter @Setter
    private Timing end;

    @Getter @Setter
    private String status;

    @Getter @Setter
    private Boolean is_free;

    @Getter @Setter
    private String venue_id;

    @Getter @Setter
    private String category_id;

    @Getter @Setter
    private String subcategory_id;

    @Override
    public String toString() {
        return name.getText();
    }
}