package com.niq.ecommerceservice.dto;

public class OrderResponse {

    private String shopperId;
    private String productId;
    private String category;
    private String brand;

    public OrderResponse(String shopperId, String productId, String category, String brand) {
        this.shopperId = shopperId;
        this.productId = productId;
        this.category = category;
        this.brand = brand;
    }
}
