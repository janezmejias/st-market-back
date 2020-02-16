package com.st.market.stmarket.order.repository;

import com.st.market.stmarket.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
