package com.example.ecommerce.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductCriationDto {

    @NotBlank @NotNull
    @Size(min = 3, max = 100, message = "The name must have a size greater than 3 and less than 100")
    private String name;

    @NotBlank @NotNull
    @Size(min = 2, max = 50, message = "The manufacturer must have a size greater than 2 and less than 50")
    private String manufacturer;

    @NotBlank @NotNull
    @Size(min = 3, max = 50, message = "The category must have a size greater than 2 and less than 50")
    private String category;

    @NotNull
    @Min(value = 0, message = "The quantity must be equal to or greater then zero")
    private Integer stockQuantity;

    @NotNull
    @Min(value = 0, message = "The salePrice must be equal to or greater then zero")
    private Double salePrice;

    @NotNull
    @Min(value = 0, message = "The salePrice must be equal to or greater then zero")
    private Double purchasePrince;


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
