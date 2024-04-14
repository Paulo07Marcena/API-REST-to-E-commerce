package com.example.ecommerce.dto;

public class ProductPreviewDto {

    private Integer id;
    private String name;
    private String manufacturer;
    private String category;
    private Integer stockQuantity;
    private Integer soldAmount;
    private Double salePrice;
    private Double purchasePrice;
    private Double profit;

        public ProductPreviewDto(
            Integer id,
            String name,
            String manufacturer,
            String category,
            Integer stockQuantity,
            Integer soldAmount,
            Double salePrice,
            Double purchasePrince
    ) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.soldAmount = soldAmount;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrince;
        this.profit = calculateProfit();
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

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getProfit() {
        return this.profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    private Double calculateProfit() {
        return (salePrice - purchasePrice) * soldAmount;
    }
}
