package com.st.market.stmarket.cart.repository;

import com.st.market.stmarket.cart.model.ProductCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author janez
 */
public interface ProductCartRepository extends JpaRepository<ProductCart, Long> {

    @Query(value = "SELECT * FROM product_cart" +
            " WHERE cart_id = :cart_id AND product_id = :product_id LIMIT 1", nativeQuery = true)
    ProductCart findOneBy(
            @Param("cart_id") Long cartId,
            @Param("product_id") Long productId);

    long deleteByCartId(Long cartId);

}