package com.st.market.stmarket.api.security.model;

/**
 *
 * @author janez
 * @see
 * @version 2019H
 * @since 06-29-2019
 */
public class PropertyModel {

    private String secretKey;
    private Long expirationTime;

    public PropertyModel() {
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

}
