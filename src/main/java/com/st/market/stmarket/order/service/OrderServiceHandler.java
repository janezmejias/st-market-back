package com.st.market.stmarket.order.service;

import com.st.market.stmarket.cart.model.Cart;
import com.st.market.stmarket.cart.repository.CartRepository;
import com.st.market.stmarket.cart.repository.ProductCartRepository;
import com.st.market.stmarket.order.model.Order;
import com.st.market.stmarket.order.repository.OrderRepository;
import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.model.ProductOrder;
import com.st.market.stmarket.product.repository.ProductOrderRepository;
import com.st.market.stmarket.product.repository.ProductRepository;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
public class OrderServiceHandler implements OrderService {

    @Autowired
    OrderRepository repository;

    @Autowired
    ProductOrderRepository productOrderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductCartRepository productCartRepository;

    @Autowired
    CartRepository cartRepository;

    @Override
    public List<Order> findByUserId(Long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<ProductOrder> findByOrderId(Long orderId) {
        List<ProductOrder> list = productOrderRepository.findByOrderId(orderId);
        Map<Long, ProductOrder> map = new HashMap<>();
        List<ProductOrder> response = new ArrayList<>();

        list.forEach((model) -> {
            if (map.containsKey(model.getProductId())) {
                ProductOrder productOrder = map.get(model.getProductId());
                productOrder.setAvailable(productOrder.getAvailable() + 1);

                map.put(model.getProductId(), productOrder);
            } else {
                model.setAvailable(1L);
                map.put(model.getProductId(), model);
            }
        });
        map.entrySet().stream().map((entry) -> entry.getValue()).forEachOrdered((value) -> {
            response.add(value);
        });

        return response;
    }

    @Transactional
    @Override
    public Order save(Order model) throws Exception {
        List<Product> products = productRepository.findProductCartByToOrder(model.getUserId());

        if (products.isEmpty()) {
            throw new Exception("No products available for this order.");
        }
        Order response = repository.save(model);

        Set<ProductOrder> productOrderSet = new HashSet<>();

        for (Product item : products) {
            ProductOrder productOrder = new ProductOrder();
            productOrder.setId(item.getId());
            productOrder.setTitle(item.getTitle());
            productOrder.setName(item.getName());
            productOrder.setImage(item.getImage());
            productOrder.setOldPrice(item.getOldPrice());
            productOrder.setNewPrice(item.getNewPrice());
            productOrder.setDiscount(item.getDiscount());
            productOrder.setAvailable(item.getAvailable());
            productOrder.setDescription(item.getDescription());
            productOrder.setOrder(response);
            productOrder.setProductId(item.getId());

            productOrderSet.add(productOrder);
        }

        model.setProducts(productOrderSet);

        Iterator<ProductOrder> iterator = model.getProducts().iterator();
        while (iterator.hasNext()) {
            ProductOrder productOrder = iterator.next();
            productOrderRepository.save(productOrder);
        }

        Cart cart = cartRepository.findByUserId(model.getUserId());
        productCartRepository.deleteByCartId(cart.getId());

        return response;
    }

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public Iterable<Order> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Order model) {

    }

    @Override
    public void deleteAll() {

    }
}
