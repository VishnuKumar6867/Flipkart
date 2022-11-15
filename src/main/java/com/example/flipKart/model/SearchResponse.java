package com.example.flipKart.model;

import java.time.LocalDateTime;

public class SearchResponse {


        private long itemNumber;
        private LocalDateTime startDate;
        private String productName;
        private double price;

    public SearchResponse() {
    }

    public SearchResponse(long itemNumber, LocalDateTime startDate, String productName, double price) {
        this.itemNumber = itemNumber;
        this.startDate = startDate;
        this.productName = productName;
        this.price = price;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
