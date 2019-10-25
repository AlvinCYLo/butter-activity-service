package com.butter.service;

import com.butter.model.poi.TomtomPOIResponse;

public interface TomtomService {

    TomtomPOIResponse discoverTTPOIs(String category, String lat, String lon);
}