package com.example.flipKart.model;

import com.example.flipKart.entity.Product;

import java.time.LocalDateTime;

public class ItemModel {
    private long itemId;
    private long itemNumber;
    private String itemName;
     private String productName;
   //private Product product;
    //   private String fromPlace;
    //private String toPlace;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int quantity;
    private double itemPrice;
    // private int rows;
    //private String mealType;
    private String features;

    public ItemModel() {
    }

    public ItemModel(long itemId, long itemNumber, String itemName, String productName, LocalDateTime startDate, LocalDateTime endDate, int quantity, double itemPrice, String features) {
        this.itemId = itemId;
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.productName = productName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.features = features;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "ItemModel{" +
                "itemId=" + itemId +
                ", itemNumber=" + itemNumber +
                ", itemName='" + itemName + '\'' +
                ", productName='" + productName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", quantity=" + quantity +
                ", itemPrice=" + itemPrice +
                ", features='" + features + '\'' +
                '}';
    }
}
