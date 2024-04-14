package com.example.ecommerce.service;

import com.example.ecommerce.contract.ProductRepository;
import com.example.ecommerce.dto.ProductClientPreviewDto;
import com.example.ecommerce.dto.ProductCriationDto;
import com.example.ecommerce.dto.ProductPreviewDto;
import com.example.ecommerce.dto.UpdateProductQuantityDto;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.mapper.ProductViewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    private static ProductRepository productRepository = null;
    static ProductViewMapper productViewMapper = new ProductViewMapper();

    @Autowired
    public ProductService(ProductRepository productRepository) {
        ProductService.productRepository = productRepository;
    }


    //@Post
    public static ResponseEntity<ProductPreviewDto> addProduct(ProductCriationDto newProduct) {
        if (newProduct == null) return ResponseEntity.status(204).build();

        Product product = productRepository.save(productViewMapper.map(newProduct));

        return ResponseEntity.status(201).body(productViewMapper.map(product));
    }

    //@Post
    public static ResponseEntity<ProductClientPreviewDto> purchase(int id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isEmpty()) return ResponseEntity.status(204).build();

        int stockQuantity = product.get().getStockQuantity() - 1;
        int soldAmount = product.get().getSoldAmount() + 1;

        if (stockQuantity < 0) return ResponseEntity.status(404).build();

        product.get().setStockQuantity(stockQuantity);
        product.get().setSoldAmount(soldAmount);

        return ResponseEntity.status(200).body(productViewMapper.mapToClient(productRepository.save(product.get())));
    }

    //@Get
    public static ResponseEntity<List<ProductPreviewDto>> findAllProducts() {
        List<Product> products = productRepository.findAll();

        if (products.isEmpty()) return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(productViewMapper.mapListPreviewDto(products));
    }

    //@Get - - - SELLER'S VIEW
    public static ResponseEntity<ProductPreviewDto> findProductById(int id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isEmpty()) return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(productViewMapper.map(product.get()));
    }

    //@Get - - - CLIENTS'S VIEW
    public static ResponseEntity<ProductClientPreviewDto> findProductByIdToClient(Integer id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isEmpty()) return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(productViewMapper.mapToClient(product.get()));
    }


    //@Get
    public static ResponseEntity<List<ProductClientPreviewDto>> lookForProductByCategoryAndPrice(String category, Double initialPrice, Double finalPrice) {
        List<Product> products = productRepository.findByCategoryEqualsIgnoreCaseAndSalePriceBetween(category,initialPrice,finalPrice);

        if (products.isEmpty()) return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(productViewMapper.mapListToClient(products));
    }

    //@Get
    public static ResponseEntity<List<ProductPreviewDto>> lookForBestSellersProdutc(Double soldAmount) {
        List<Product> products = productRepository.findBySoldAmountGreaterThanEqual(soldAmount);

        if (products.isEmpty()) return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(productViewMapper.mapListPreviewDto(products));
    }

    //@Patch
    public static ResponseEntity<ProductPreviewDto> updateProductQuantity(
            int id,
            UpdateProductQuantityDto updateProductQuantityDto
    ) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isEmpty()) return ResponseEntity.status(204).build();

        product.get().setStockQuantity(updateProductQuantityDto.getNewQuantity());

        return ResponseEntity.status(200).body(productViewMapper.map(productRepository.save(product.get())));
    }
}
