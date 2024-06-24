package com.niq.ecommerceservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="product_details")
public class ProductDetails {

    @Id
    private String productId;
    private String category;
    private String brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ShopperPersonalizedProduct shopperPersonalizedProduct;

    public ProductDetails() {
    }

    public ProductDetails(String productId, String category, String brand) {
        this.productId = productId;
        this.category = category;
        this.brand = brand;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShopperId(){
        return shopperPersonalizedProduct.getShopperId();
    }

    @JsonIgnore
    public ShopperPersonalizedProduct getShopperPersonalizedProduct(){
        return shopperPersonalizedProduct;
    }

    @JsonIgnore
    public void setShopperPersonalizedProduct(ShopperPersonalizedProduct shopperPersonalizedProduct){
        this.shopperPersonalizedProduct = shopperPersonalizedProduct;
    }

}
