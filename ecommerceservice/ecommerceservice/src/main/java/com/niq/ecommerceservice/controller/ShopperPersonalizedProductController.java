package com.niq.ecommerceservice.controller;

import com.niq.ecommerceservice.dto.OrderResponse;
import com.niq.ecommerceservice.model.ProductDetails;
import com.niq.ecommerceservice.model.ShopperPersonalizedProduct;
import com.niq.ecommerceservice.model.ShoppersProdcutsList;
import com.niq.ecommerceservice.repository.ProductRepository;
import com.niq.ecommerceservice.repository.ShopperPersonalizedProductRepository;
import com.niq.ecommerceservice.service.ShopperPersonalizedProductDetailsService;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shopper_personalized_prodcuts")
public class ShopperPersonalizedProductController {

    @Autowired
    ShopperPersonalizedProduct shopperPersonalizedProduct;

    @Autowired
    ShoppersProdcutsList shoppersProdcutsList;

    @Autowired
    ShopperPersonalizedProductDetailsService shopperPersonalizedProductDetailsService;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShopperPersonalizedProductRepository shopperPersonalizedProductRepository;

    public ShopperPersonalizedProductController(ShopperPersonalizedProductDetailsService shopperPersonalizedProductDetailsService) {
        this.shopperPersonalizedProductDetailsService = shopperPersonalizedProductDetailsService;
    }

    //Read Specific Shopper Product Details from Db
    @GetMapping("{shopperId}")
    public ShopperPersonalizedProduct getShopperProductDetails( @PathVariable("shopperId")  String shopperId ){
        return shopperPersonalizedProductDetailsService.getShopperPersonalizedProductDetails( shopperId );
    }

    //Read All Shopper Product Details from Db
    @GetMapping()
    public List<ShopperPersonalizedProduct> getProductDetails(){
        return shopperPersonalizedProductDetailsService.getAllShopperPersonalizedProductDetails();
    }

    //Create Shopper product details into DB
    @PostMapping
    public String createProductDetails(@RequestBody ShopperPersonalizedProduct shopperPersonalizedProduct)
    {
        shopperPersonalizedProductDetailsService.createShopperPersonlizedProductDetailsService(shopperPersonalizedProduct);
        return "Shoppers product loaded successfully";
    }

    /*Retrive the products based on Shopper Id, Porduct id, Categoty, Brand

        ShopperId is manidatory Parameter
        Porduct id, Categoty, Brand are optional Parameter
     */

    @RequestMapping(value = "/productList/shopperId/{shopperId}", method = RequestMethod.GET, produces = "text/xml")
    public List<OrderResponse> getProductList(@PathVariable("shopperId") String shopperId,
                                              @RequestParam("productId") Optional<String> productId,
                                              @RequestParam("category") Optional<String> category,
                                              @RequestParam("brand") Optional<String> brand){
        return shopperPersonalizedProductRepository.getJoinInformation(shopperId,productId,category,brand);
    }
}
