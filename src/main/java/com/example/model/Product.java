package com.example.model;

public class Product {

    private String prodId;
    private String prodName;
    private String prodCategory;
    private String prodDescription;
    private double prodPrice;
    private String prodCondition;
    private String prodStatus;
    private int prodUnitInStock;
    private String prodManufacturer;

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(String prodCategory) {
        this.prodCategory = prodCategory;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdCondition() {
        return prodCondition;
    }

    public void setProdCondition(String prodCondition) {
        this.prodCondition = prodCondition;
    }

    public String getProdStatus() {
        return prodStatus;
    }

    public void setProdStatus(String prodStatus) {
        this.prodStatus = prodStatus;
    }

    public int getProdUnitInStock() {
        return prodUnitInStock;
    }

    public void setProdUnitInStock(int prodUnitInStock) {
        this.prodUnitInStock = prodUnitInStock;
    }

    public String getProdManufacturer() {
        return prodManufacturer;
    }

    public void setProdManufacturer(String prodManufacturer) {
        this.prodManufacturer = prodManufacturer;
    }
}
