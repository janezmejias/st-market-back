package com.st.market.stmarket.cart.service;

import com.st.market.stmarket.cart.model.Cart;
import com.st.market.stmarket.cart.model.ProductCart;
import com.st.market.stmarket.cart.repository.CartRepository;
import com.st.market.stmarket.cart.repository.ProductCartRepository;

import java.util.List;
import java.util.Optional;

import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.repository.ProductRepository;
import com.st.market.stmarket.user.model.User;
import com.st.market.stmarket.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 *
 * @author janez
 */
@Service
@Lazy
public class CartServiceHandler implements CartService {

    @Autowired
    CartRepository repository;

    @Autowired
    ProductCartRepository productCartRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public ProductCart removeItemCart(ProductCart model) {
        Cart cart = repository.findByUserId(model.getCartId());
        model.setCartId(cart.getId());

        ProductCart productCart = productCartRepository.findOneBy(cart.getId(), model.getProductId());
        productCartRepository.delete(productCart);

        return productCart;
    }

    @Override
    public Long countProductCartBy(Long userId) {
        return productRepository.countProductCartBy(userId);
    }

    @Override
    public ProductCart addItemCart(ProductCart model) {
        Cart cart = repository.findByUserId(model.getCartId());
        model.setCartId(cart.getId());
        return productCartRepository.save(model);
    }

    @Override
    public List<Product> findProductCart(Long userId) {
        return productRepository.findProductCartBy(userId);
    }

    @Override
    public Cart save(Cart s) {
        Cart cart = repository.findByUserId(s.getUserId());
        if (cart == null) {
            cart = repository.save(s);
            return cart;
        }
        return repository.save(s);
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
    public void deleteAll() {
        repository.deleteAll();
    }

}
