package com.st.market.stmarket.product.controller;

import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.repository.ProductRepository;
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
@RequestMapping(Constants.URI_PRODUCT)
@Lazy
@CrossOrigin
public class ProductController extends ControllerBase<Product, Long> {

    @Autowired
    public ProductController(ProductRepository repository) {
        super(repository);
    }

}
