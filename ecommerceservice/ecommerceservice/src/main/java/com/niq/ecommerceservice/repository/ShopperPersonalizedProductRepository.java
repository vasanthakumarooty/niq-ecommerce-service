package com.niq.ecommerceservice.repository;

import com.niq.ecommerceservice.dto.OrderResponse;
import com.niq.ecommerceservice.model.ShopperPersonalizedProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShopperPersonalizedProductRepository extends JpaRepository<ShopperPersonalizedProduct, String> {

    @Query("Select  new com.niq.ecommerceservice.dto.OrderResponse(s.shopperId, p.productId, p.category, p.brand) form shopper_personalized_product s Join p Join c.product_details where s.shopperId=:shopperId and p.productId=:productId AND p.category=:category AND p.brand=brand" )
    public List<OrderResponse> getJoinInformation(@Param("shopperId") String shopperId, @Param("productId") Optional<String> productId,
                                                  @Param("category") Optional<String> category, @Param("brand") Optional<String> brand);
}
