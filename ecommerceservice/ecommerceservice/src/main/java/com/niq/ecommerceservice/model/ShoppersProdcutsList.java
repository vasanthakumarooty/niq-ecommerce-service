package com.niq.ecommerceservice.model;

public class ShoppersProdcutsList {

    private String productId;
    private String relevancyScore;

    public ShoppersProdcutsList() {
    }

    public ShoppersProdcutsList(String productId, String relevancyScore) {
        this.productId = productId;
        this.relevancyScore = relevancyScore;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getRelevancyScore() {
        return relevancyScore;
    }

    public void setRelevancyScore(String relevancyScore) {
        this.relevancyScore = relevancyScore;
    }
}
