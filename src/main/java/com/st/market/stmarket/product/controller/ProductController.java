package com.st.market.stmarket.product.controller;

import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author janez
 */
@RestController
@RequestMapping(Constants.URI_PRODUCT)
@Lazy
@CrossOrigin
public class ProductController extends ControllerBase<Product> {

    @Autowired
    ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        super(service);
    }

    @GetMapping(Constants.TOP_PRODUCTS)
    @ResponseBody
    ResponseEntity<?> findBy() {
        try {
            List<Product> list = service.firstTopProduct();
            return new ResponseEntity(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
