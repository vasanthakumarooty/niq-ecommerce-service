package com.niq.ecommerceservice.controller;

import com.niq.ecommerceservice.model.ProductDetails;
import com.niq.ecommerceservice.model.ShopperPersonalizedProduct;
import com.niq.ecommerceservice.repository.ShopperPersonalizedProductRepository;
import com.niq.ecommerceservice.service.ProductDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductDetailsService productDetailsService;


    public ProductController(ProductDetailsService productDetailsService) {
        this.productDetailsService = productDetailsService;
    }

    //Read Specific Product Details from Db
    @GetMapping("{productId}")
    public ProductDetails getProductDetails(@PathVariable("productId") String productId ){

        return productDetailsService.getProductDetails(productId);
    }

    //Read All Product Details from Db
    @GetMapping()
    public List<ProductDetails> getAllProductDetails(){

        return productDetailsService.getAllProductDetails();
    }

    //Store Product Details
    @PostMapping
    public String createProductDetails(@RequestBody ProductDetails productDetails)
    {
        productDetailsService.createProductDetailsService(productDetails);
        return "Product created successfully";
    }


}
