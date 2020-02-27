package com.st.market.stmarket.invoice.model;

import com.st.market.stmarket.address.model.Address;
import com.st.market.stmarket.order.model.Order;
import com.st.market.stmarket.user.model.User;

/**
 *
 * @author janez
 */
public class Invoice {

    private Order order;
    private User user;
    private Address address;

    public Invoice(Order order, User user, Address address) {
        this.order = order;
        this.user = user;
        this.address = address;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
