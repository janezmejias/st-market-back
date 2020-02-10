package com.st.market.stmarket.product.repository;

import com.st.market.stmarket.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *
 * @author janez
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT p.* FROM Product p LIMIT 10", nativeQuery = true)
    List<Product> firstTopProduct();

    @Query(value = "SELECT count(p.id) as available, p.* " +
            " FROM Product p " +
            " INNER JOIN Product_Cart pc on pc.product_id = p.id " +
            " INNER JOIN Cart c ON c.id = pc.cart_id " +
            " WHERE c.user_id = :userId group by p.id", nativeQuery = true)
    List<Product> findProductCartBy(@Param("userId") Long userId);

    @Query(value = "SELECT count(p.id) as available " +
            " FROM product p " +
            " INNER JOIN product_cart pc on pc.product_id = p.id " +
            " INNER JOIN cart c ON c.id = pc.cart_id " +
            " WHERE c.user_id = :userId", nativeQuery = true)
    Long countProductCartBy(@Param("userId") Long userId);
}
