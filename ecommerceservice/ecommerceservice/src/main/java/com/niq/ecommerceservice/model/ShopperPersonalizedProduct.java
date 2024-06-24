package com.niq.ecommerceservice.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="shopper_personalized_product")
public class ShopperPersonalizedProduct implements Serializable {

    @Id
    private String shopperId;
    private ShoppersProdcutsList[] shoppersProdcutsList;

    @OneToMany(targetEntity = ProductDetails.class, cascade = CascadeType.ALL)
    @JoinColumn(name="shopper_product_data",referencedColumnName = "productId")
    private List<ProductDetails> productDetails;

    public ShopperPersonalizedProduct() {
    }

    public ShopperPersonalizedProduct(String shopperId, ShoppersProdcutsList[] shoppersProdcutsList) {
        this.shopperId = shopperId;
        this.shoppersProdcutsList = shoppersProdcutsList;
    }

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public ShoppersProdcutsList[] getShoppersProdcutsList() {
        return shoppersProdcutsList;
    }

    public void setShoppersProdcutsList(ShoppersProdcutsList[] shoppersProdcutsList) {
        this.shoppersProdcutsList = shoppersProdcutsList;
    }

}
