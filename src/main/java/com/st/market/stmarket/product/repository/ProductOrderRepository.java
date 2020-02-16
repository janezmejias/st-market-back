package com.st.market.stmarket.product.repository;

import com.st.market.stmarket.product.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {

    @Query(value = "SELECT count(p.id) as available, p.* " +
            " FROM Product p " +
            " INNER JOIN Product_Cart pc on pc.product_id = p.id " +
            " INNER JOIN Cart c ON c.id = pc.cart_id " +
            " WHERE c.user_id = :orderId group by p.id", nativeQuery = true)
    List<ProductOrder> findProductOrderBy(@Param("orderId") Long orderId);

}
