package com.st.market.stmarket.order.service;

import com.st.market.stmarket.api.ServiceBase;
import com.st.market.stmarket.order.model.Order;

import java.util.List;

public interface OrderService extends ServiceBase<Order> {

    List<Order> findByUserId(Long userId);
}
