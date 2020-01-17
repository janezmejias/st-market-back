package com.st.market.stmarket.product.repository;

import com.st.market.stmarket.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author janez
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
