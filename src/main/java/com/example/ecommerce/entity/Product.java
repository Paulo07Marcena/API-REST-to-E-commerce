package com.example.ecommerce.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String manufacturer;
    private String category;
    private Integer stockQuantity;
    private Integer soldAmount;
    private Double salePrice;
    private Double purchasePrince;


    public Product() {}

    public Product(
            String name,
            String manufacturer,
            String category,
            Integer stockQuantity,
            Integer soldAmount,
            Double salePrice,
            Double purchasePrince
    ) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.soldAmount = soldAmount;
        this.salePrice = salePrice;
        this.purchasePrince = purchasePrince;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Integer getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(Integer soldAmount) {
        this.soldAmount = soldAmount;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getPurchasePrince() {
        return purchasePrince;
    }

    public void setPurchasePrince(Double purchasePrince) {
        this.purchasePrince = purchasePrince;
    }
}
