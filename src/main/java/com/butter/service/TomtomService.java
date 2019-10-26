package com.butter.service;

import com.butter.model.poi.TomtomPOIResponse;

import org.springframework.stereotype.Component;

@Component
public interface TomtomService {

    TomtomPOIResponse discoverTTPOIs(String category, String lat, String lon);
}