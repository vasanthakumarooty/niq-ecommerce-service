package com.niq.ecommerceservice.impl;

import com.niq.ecommerceservice.model.ShopperPersonalizedProduct;
import com.niq.ecommerceservice.repository.ShopperPersonalizedProductRepository;
import com.niq.ecommerceservice.service.ShopperPersonalizedProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShopperPersonalizedProductDetailsServiceImpl implements ShopperPersonalizedProductDetailsService {

    @Autowired
    ShopperPersonalizedProductRepository shopperPersonalizedProductRepository;

    public ShopperPersonalizedProductDetailsServiceImpl(ShopperPersonalizedProductRepository shopperPersonalizedProductRepository) {
        this.shopperPersonalizedProductRepository = shopperPersonalizedProductRepository;
    }

    @Override
    public String createShopperPersonlizedProductDetailsService(ShopperPersonalizedProduct shopperPersonalizedProduct) {
        shopperPersonalizedProductRepository.save( shopperPersonalizedProduct);
        return "successfully retrived basic details";
    }

    @Override
    public ShopperPersonalizedProduct getShopperPersonalizedProductDetails(String productId) {
        return shopperPersonalizedProductRepository.findById(productId).get();
    }

    @Override
    public List<ShopperPersonalizedProduct> getAllShopperPersonalizedProductDetails() {
        return shopperPersonalizedProductRepository.findAll();
    }
}
