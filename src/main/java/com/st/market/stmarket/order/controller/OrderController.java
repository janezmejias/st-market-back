package com.st.market.stmarket.order.controller;

import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import com.st.market.stmarket.order.model.Order;
import com.st.market.stmarket.order.service.OrderService;
import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.model.ProductOrder;
import com.st.market.stmarket.product.service.ProductService;
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
@RequestMapping(Constants.URI_ORDER)
@Lazy
@CrossOrigin
public class OrderController extends ControllerBase<Order> {

    @Autowired
    OrderService orderService;

    @Autowired
    ProductService productService;

    @Autowired
    OrderController(OrderService service) {
        super(service);
    }

    @GetMapping(Constants.FIND_BY_USER_ID)
    @ResponseBody
    ResponseEntity<?> findBy(@RequestParam("userId") Long userId) {
        try {
            List<Order> list = orderService.findByUserId(userId);
            return new ResponseEntity(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(Constants.FIND_PRODUCTS_BY_ORDER_ID)
    @ResponseBody
    ResponseEntity<?> findProductsBy(@RequestParam("orderId") Long orderId) {
        try {            
            List<ProductOrder> list = orderService.findByOrderId(orderId);
            return new ResponseEntity(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
