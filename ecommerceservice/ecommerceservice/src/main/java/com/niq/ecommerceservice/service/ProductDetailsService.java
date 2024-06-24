package com.niq.ecommerceservice.service;

import com.niq.ecommerceservice.model.ProductDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductDetailsService {

    public String createProductDetailsService(ProductDetails productDetails);

    public ProductDetails getProductDetails(String productId);

    public List<ProductDetails> getAllProductDetails();
}
