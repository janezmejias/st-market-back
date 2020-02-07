package com.st.market.stmarket.cart.repository;

import com.st.market.stmarket.cart.model.ProductCart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author janez
 */
public interface ProductCartRepository extends JpaRepository<ProductCart, Long> {

}