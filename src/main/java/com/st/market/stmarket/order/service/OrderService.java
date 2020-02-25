package com.st.market.stmarket.order.service;

import com.st.market.stmarket.api.ServiceBase;
import com.st.market.stmarket.order.model.Order;
import com.st.market.stmarket.product.model.ProductOrder;

import java.util.List;
import org.springframework.data.repository.query.Param;

public interface OrderService extends ServiceBase<Order> {

    List<Order> findByUserId(Long userId);
    
    List<ProductOrder> findByOrderId(@Param("orderId") Long orderId);
}
