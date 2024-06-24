package com.niq.ecommerceservice.service;
import com.niq.ecommerceservice.model.ProductDetails;
import com.niq.ecommerceservice.model.ShopperPersonalizedProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShopperPersonalizedProductDetailsService {

    public String createShopperPersonlizedProductDetailsService(ShopperPersonalizedProduct shopperPersonalizedProduct);

    public ShopperPersonalizedProduct getShopperPersonalizedProductDetails(String productId);

    public List<ShopperPersonalizedProduct> getAllShopperPersonalizedProductDetails();
}
