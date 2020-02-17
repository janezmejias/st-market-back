package com.st.market.stmarket.api.security.model;

import com.st.market.stmarket.user.model.User;

/**
 *
 * @author janez
 * @see
 * @version 2019H
 * @since 06-29-2019
 */
public class JwtResponse {

    private String token;
    private User user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
