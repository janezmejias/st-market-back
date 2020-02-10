package com.st.market.stmarket.cart.controller;

import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import com.st.market.stmarket.cart.model.ProductCart;
import com.st.market.stmarket.cart.service.CartService;
import com.st.market.stmarket.cart.model.Cart;
import com.st.market.stmarket.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping(Constants.HTTP_ADD_ITEM_CART)
    @ResponseBody
    ResponseEntity<?> addItemCart(@RequestBody ProductCart model) {
        try {
            ProductCart productCart = cartService.addItemCart(model);
            return new ResponseEntity(productCart, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(Constants.HTTP_GET_ITEMS_CART)
    @ResponseBody
    ResponseEntity<?> findBy(@RequestParam("userId") Long userId) {
        try {
            List<Product> list = cartService.findProductCart(userId);
            return new ResponseEntity(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(Constants.HTTP_COUNT_ITEMS_CART)
    @ResponseBody
    ResponseEntity<?> count(@RequestParam("userId") Long userId) {
        try {
            Long count = cartService.countProductCartBy(userId);
            return new ResponseEntity(count, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(Constants.HTTP_REMOVE_ITEM_CART)
    @ResponseBody
    ResponseEntity<?> removeItemCart(@RequestBody ProductCart model) {
        try {
            ProductCart productCart = cartService.removeItemCart(model);
            return new ResponseEntity(productCart, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
