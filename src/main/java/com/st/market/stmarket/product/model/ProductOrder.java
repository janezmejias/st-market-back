package com.st.market.stmarket.product.model;

import com.st.market.stmarket.order.model.Order;

import javax.persistence.*;

@Entity
@Table(name = "Product_Order", catalog = "dbmaster")
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
