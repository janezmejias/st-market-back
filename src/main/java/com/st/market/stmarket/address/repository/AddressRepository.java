package com.st.market.stmarket.address.repository;

import com.st.market.stmarket.address.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
