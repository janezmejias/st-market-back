package com.st.market.stmarket.product.service;

import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.model.ProductOrder;
import com.st.market.stmarket.product.repository.ProductOrderRepository;
import com.st.market.stmarket.product.repository.ProductRepository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 *
 * @author janez
 */
@Service
@Lazy
public class ProductServiceHandler implements ProductService {

    @Autowired
    ProductRepository repository;

    @Autowired
    ProductOrderRepository productOrderRepository;

    @Override
    public List<ProductOrder> findByOrderId(Long orderId) {
        return productOrderRepository.findByOrderId(orderId);
    }

    @Override
    public ProductOrder addProductOrder(ProductOrder model) {
        return productOrderRepository.save(model);
    }

    @Override
    public Product save(Product model) {
        return repository.save(model);
    }

    @Override
    public List<Product> firstTopProduct() {
        return repository.firstTopProduct();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(Product t) {
        repository.delete(t);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

}
