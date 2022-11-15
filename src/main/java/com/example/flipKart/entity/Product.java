package com.example.flipKart.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    private String productName;
    private String contactNumber;
    private String contactAddress;
    private Boolean blockedStatus;

    public Product(long productId, String productName, String contactNumber, String contactAddress, Boolean blockedStatus) {
        this.productId = productId;
        this.productName = productName;
        this.contactNumber = contactNumber;
        this.contactAddress = contactAddress;
        this.blockedStatus = blockedStatus;
    }

    public Product() {

    }

    public Product(String productName, String contactNumber, String contactAddress, boolean b) {
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Boolean getBlockedStatus() {
        return blockedStatus;
    }

    public void setBlockedStatus(Boolean blockedStatus) {
        this.blockedStatus = blockedStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", blockedStatus=" + blockedStatus +
                '}';
    }
}

