package com.st.market.stmarket.cart.repository;

import com.st.market.stmarket.cart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author janez
 */
public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByUserId(Long userId);
}
