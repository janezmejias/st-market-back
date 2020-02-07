package com.st.market.stmarket.cart.service;

import com.st.market.stmarket.cart.model.Cart;
import com.st.market.stmarket.cart.repository.CartRepository;
import com.st.market.stmarket.cart.repository.ProductCartRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author janez
 */
@Service
public class CartServiceHandler implements CartService {

    @Autowired
    CartRepository repository;

    @Autowired
    ProductCartRepository productCartRepository;

    @Override
    public <S extends Cart> S save(S s) {
        Cart cart = repository.findByUserId(s.getUserId());
        if (cart == null) {
            cart = repository.save(s);
            return (S) cart;
        }
        return repository.save(s);
    }

    @Override
    public <S extends Cart> Iterable<S> saveAll(Iterable<S> itrbl) {
        return repository.saveAll(itrbl);
    }

    @Override
    public Optional<Cart> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Iterable<Cart> findAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<Cart> findAllById(Iterable<Long> itrbl) {
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
    public void delete(Cart t) {
        repository.delete(t);
    }

    @Override
    public void deleteAll(Iterable<? extends Cart> itrbl) {
        repository.deleteAll();
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

}
