package com.st.market.stmarket.product.service;

import com.st.market.stmarket.api.ServiceBase;
import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.model.ProductOrder;

import java.util.List;

public interface ProductService extends ServiceBase<Product> {

    List<Product> firstTopProduct();

    ProductOrder addProductOrder(ProductOrder model);

    List<ProductOrder> findByOrderId(Long orderId);
}