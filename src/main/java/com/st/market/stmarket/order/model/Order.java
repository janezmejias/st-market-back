package com.st.market.stmarket.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.st.market.stmarket.product.model.ProductOrder;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
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

    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "invoice_no")
    private String invoiceNo;

    @CreationTimestamp
    @Column(name = "creation_date")
    private Timestamp creationDate;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<ProductOrder> products;

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

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Set<ProductOrder> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductOrder> products) {
        this.products = products;
    }

}
