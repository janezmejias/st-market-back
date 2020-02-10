package com.st.market.stmarket.product.service;

import com.st.market.stmarket.api.ServiceBase;
import com.st.market.stmarket.product.model.Product;

import java.util.List;

/**
 *
 * @author janez
 */
public interface ProductService extends ServiceBase<Product> {

    List<Product> firstTopProduct();
}