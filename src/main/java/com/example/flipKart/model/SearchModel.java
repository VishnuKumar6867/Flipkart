package com.example.flipKart.model;

import java.time.LocalDateTime;

public class SearchModel {

        private LocalDateTime date;
        //private String fromPlace;
        //	private String toPlace;
        private String features;

    public SearchModel() {
    }

    public SearchModel(LocalDateTime date, String features) {
        this.date = date;
        this.features = features;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
