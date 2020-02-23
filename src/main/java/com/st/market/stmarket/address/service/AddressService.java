package com.st.market.stmarket.address.service;

import com.st.market.stmarket.address.model.Address;
import com.st.market.stmarket.api.ServiceBase;

import java.util.List;

public interface AddressService extends ServiceBase<Address> {

    List<Address> findByUserId(Long userId);
}
