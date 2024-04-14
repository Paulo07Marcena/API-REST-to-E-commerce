package com.example.ecommerce.contract;

import com.example.ecommerce.entity.Product;
import org.hibernate.annotations.processing.Find;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByCategoryEqualsIgnoreCaseAndSalePriceBetween(String category, Double initialPrice, Double finalPrice);
    List<Product> findBySoldAmountGreaterThanEqual(Double soldAmount);
}
