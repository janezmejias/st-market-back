package com.st.market.stmarket.order.controller;

import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import com.st.market.stmarket.order.model.Order;
import com.st.market.stmarket.order.service.OrderService;
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
@RequestMapping(Constants.URI_ORDER)
@Lazy
@CrossOrigin
public class OrderController extends ControllerBase<Order> {

    @Autowired
    OrderController(OrderService service) {
        super(service);
    }

}
