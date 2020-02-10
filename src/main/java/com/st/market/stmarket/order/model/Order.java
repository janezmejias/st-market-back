package com.st.market.stmarket.order.model;

import com.st.market.stmarket.product.model.Product;

import javax.persistence.*;
import java.util.Set;

/**
 *
 * @author janez
 */
@Entity
@Table(name = "Order", catalog = "dbmaster")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    /*
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Product> products;
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
