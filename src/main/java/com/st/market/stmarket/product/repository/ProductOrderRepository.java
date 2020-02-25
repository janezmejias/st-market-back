package com.st.market.stmarket.product.repository;

import com.st.market.stmarket.product.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.repository.query.Param;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {

        
    List<ProductOrder> findByOrderId(@Param("orderId") Long orderId);

}
