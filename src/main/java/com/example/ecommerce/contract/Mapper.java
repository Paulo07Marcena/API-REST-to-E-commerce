package com.example.ecommerce.contract;

import com.example.ecommerce.dto.ProductClientPreviewDto;
import com.example.ecommerce.dto.ProductCriationDto;
import com.example.ecommerce.dto.ProductPreviewDto;
import com.example.ecommerce.entity.Product;

import java.util.List;

public interface Mapper<InputClass, OutputClass> {

    static ProductPreviewDto map(Product product) {
        return null;
    }

    static ProductClientPreviewDto mapToClient(Product product) {
        return null;
    }

    static List<ProductClientPreviewDto> mapListToClient(List<Product> products) {
        return null;
    }

    Product map(ProductCriationDto productCriationDto);
}
