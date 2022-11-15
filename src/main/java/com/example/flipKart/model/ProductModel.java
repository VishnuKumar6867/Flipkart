package com.example.flipKart.model;

public class ProductModel {
    private long productId;
    private String productName;
    private String contactNumber;
    private String contactAddress;

    public ProductModel() {
    }

    public ProductModel(long productId, String productName, String contactNumber, String contactAddress) {
        this.productId = productId;
        this.productName = productName;
        this.contactNumber = contactNumber;
        this.contactAddress = contactAddress;
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

    @Override
    public String toString() {
        return "ProductModel{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                '}';
    }
}