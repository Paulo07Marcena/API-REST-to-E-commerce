package com.example.ecommerce.mapper;

import com.example.ecommerce.contract.Mapper;
import com.example.ecommerce.dto.ProductClientPreviewDto;
import com.example.ecommerce.dto.ProductCriationDto;
import com.example.ecommerce.dto.ProductPreviewDto;
import com.example.ecommerce.entity.Product;

import java.util.List;

public class ProductViewMapper implements Mapper<Product, ProductPreviewDto> {

    public ProductViewMapper() {}


    public static ProductPreviewDto map(Product product) {
        return new ProductPreviewDto(
                product.getId(),
                product.getName(),
                product.getManufacturer(),
                product.getCategory(),
                product.getStockQuantity(),
                product.getSoldAmount(),
                product.getSalePrice(),
                product.getPurchasePrince()
        );
    }


    public static ProductClientPreviewDto mapToClient(Product product){
        return new ProductClientPreviewDto(
                product.getId(),
                product.getName(),
                product.getManufacturer(),
                product.getCategory(),
                product.getSalePrice()
        );
    }


    public static List<ProductClientPreviewDto> mapListToClient(List<Product> products){
        return products
                .stream()
                .map(ProductViewMapper::mapToClient).toList();
    }


    @Override
    public  Product map(ProductCriationDto productCriationDto){
        return new Product(
                productCriationDto.getName(),
                productCriationDto.getManufacturer(),
                productCriationDto.getCategory(),
                productCriationDto.getStockQuantity(),
                0,
                productCriationDto.getSalePrice(),
                productCriationDto.getPurchasePrince()
        );
    }

    public static List<ProductPreviewDto> mapListPreviewDto(List<Product> products) {
        return products
                .stream()
                .map(ProductViewMapper::map).toList();
    }
}
