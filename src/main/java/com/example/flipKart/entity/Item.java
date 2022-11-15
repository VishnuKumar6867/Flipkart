package com.example.flipKart.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long itemId;
    private long itemNumber;
    private String productName;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    //private String fromPlace;
    //private String toPlace;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int quantity;
    // private int economySeats;
    private double itemPrice;
    // private int rows;
    // private String mealType;
    private String features;

    public Item() {
    }

    public Item(long itemNumber, String productName, Product product, LocalDateTime startDate, LocalDateTime endDate, int quantity, double itemPrice, String features) {
    }

    public Item(long itemId, long itemNumber, String productName, Product product, LocalDateTime startDate, LocalDateTime endDate, int quantity, double itemPrice, String features) {
        this.itemId = itemId;
        this.itemNumber = itemNumber;
        this.productName = productName;
        this.product = product;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        return "Item{" +
                "itemId=" + itemId +
                ", itemNumber=" + itemNumber +
                ", productName='" + productName + '\'' +
                ", product=" + product +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", quantity=" + quantity +
                ", itemPrice=" + itemPrice +
                ", features='" + features + '\'' +
                '}';
    }
}
