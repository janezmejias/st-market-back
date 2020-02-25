package com.st.market.stmarket.product.model;

import com.st.market.stmarket.order.model.Order;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Product_Order", catalog = "dbmaster")
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "title")
    private String title;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "old_price")
    private BigDecimal oldPrice;
    @Column(name = "new_price")
    private BigDecimal newPrice;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "available")
    private Long available;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public BigDecimal getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(BigDecimal newPrice) {
        this.newPrice = newPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Long getAvailable() {
        return available;
    }

    public void setAvailable(Long available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
