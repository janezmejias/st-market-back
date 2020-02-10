package com.st.market.stmarket.cart.service;

import com.st.market.stmarket.api.ServiceBase;
import com.st.market.stmarket.cart.model.Cart;
import com.st.market.stmarket.cart.model.ProductCart;
import com.st.market.stmarket.product.model.Product;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *
 * @author janez
 */
public interface CartService extends ServiceBase<Cart> {

    ProductCart addItemCart(ProductCart model);

    List<Product> findProductCart(Long userId);

    Long countProductCartBy(Long userId);

    ProductCart removeItemCart(ProductCart model);
}
