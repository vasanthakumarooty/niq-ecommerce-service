package com.niq.ecommerceservice.impl;

import com.niq.ecommerceservice.model.ProductDetails;
import com.niq.ecommerceservice.repository.ProductRepository;
import com.niq.ecommerceservice.repository.ShopperPersonalizedProductRepository;
import com.niq.ecommerceservice.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import com.niq.ecommerceservice.exception.ResourceNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import java.util.List;

public class ProductDetailsServiceImpl implements ProductDetailsService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShopperPersonalizedProductRepository shopperPersonalizedProductRepository;

    public ProductDetailsServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDetails> getAllProductDetails() {
        return productRepository.findAll();
    }

    @Override
    public ProductDetails getProductDetails(String productId) {
        if(!productRepository.existsById(productId)){
            throw new ResourceNotFoundException(productId+"not found");
        }
        return productRepository.findById(productId).get();
    }

    @Override
    public String createProductDetailsService(ProductDetails productDetails) {
        productRepository.save(productDetails);
        return "sucessfully product added";
    }



}
