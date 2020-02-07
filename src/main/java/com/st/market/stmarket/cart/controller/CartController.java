package com.st.market.stmarket.cart.controller;

import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import com.st.market.stmarket.cart.service.CartService;
import com.st.market.stmarket.cart.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author janez
 */
@RestController
@RequestMapping(Constants.URI_CART)
@Lazy
@CrossOrigin
public class CartController extends ControllerBase<Cart> {

    @Autowired
    CartService cartService;

    @Autowired
    public CartController(CartService service) {
        super(service);
    }

}
