package com.netology.jdbc_daolayer.services;


import com.netology.jdbc_daolayer.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public List<String> getProductName(String name) {
        return productRepository.getProductName(name);
    }
}
