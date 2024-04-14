package com.example.ecommerce.controller;


import com.example.ecommerce.contract.ProductRepository;
import com.example.ecommerce.dto.ProductClientPreviewDto;
import com.example.ecommerce.dto.ProductCriationDto;
import com.example.ecommerce.dto.ProductPreviewDto;
import com.example.ecommerce.dto.UpdateProductQuantityDto;
import com.example.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    ProductService productService = new ProductService(productRepository);

    @PostMapping
    public static ResponseEntity<ProductPreviewDto> addProduct (
            @RequestBody @Valid ProductCriationDto newProduct
    ){
        return ProductService.addProduct(newProduct);
    }

    @PostMapping("/{id}/purchase")
    public static ResponseEntity<ProductClientPreviewDto> purchase(
            @PathVariable int id
    ){
        return ProductService.purchase(id);
    }

    @GetMapping
    public static ResponseEntity<List<ProductPreviewDto>> findAllProducts(){
        return ProductService.findAllProducts();
    }

    @GetMapping("/{id}")
    public static ResponseEntity<ProductPreviewDto> findProductById(
            @PathVariable int id
    ){
        return ProductService.findProductById(id);
    }

    @GetMapping("/{id}/client")
    public static ResponseEntity<ProductClientPreviewDto> findProductByIdToClient(
            @PathVariable Integer id
    ){
        return ProductService.findProductByIdToClient(id);
    }

    @GetMapping("/filter")
    public static ResponseEntity<List<ProductClientPreviewDto>> lookForProductByCategoryAndPrice(
            @RequestParam("category") String category,
            @RequestParam("initialPrice") Double initialPrice,
            @RequestParam("finalPrice") Double finalPrice
    ){
        return ProductService.lookForProductByCategoryAndPrice(category,initialPrice,finalPrice);
    }

    @GetMapping("/bestSellers")
    public static ResponseEntity<List<ProductPreviewDto>> lookForBestSellersProduct(
            @RequestParam("soldAmount") Double soldAmount
    ){
        return ProductService.lookForBestSellersProdutc(soldAmount);
    }

    @PatchMapping("/{id}/stock")
    public static ResponseEntity<ProductPreviewDto> updateProductQuantity(
            @PathVariable int id,
            @RequestBody UpdateProductQuantityDto updateProductQuantityDto
    ){
        return ProductService.updateProductQuantity(id, updateProductQuantityDto);
    }


}
