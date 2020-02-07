package com.st.market.stmarket.product.service;

import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.repository.ProductRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author janez
 */
@Service
public class ProductServiceHandler implements ProductService {

    @Autowired
    ProductRepository repository;

    @Override
    public <S extends Product> S save(S s) {
        return repository.save(s);
    }

    @Override
    public <S extends Product> Iterable<S> saveAll(Iterable<S> itrbl) {
        return repository.saveAll(itrbl);
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
    public Iterable<Product> findAllById(Iterable<Long> itrbl) {
        return repository.findAllById(itrbl);
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
    public void deleteAll(Iterable<? extends Product> itrbl) {
        repository.deleteAll();
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

}
