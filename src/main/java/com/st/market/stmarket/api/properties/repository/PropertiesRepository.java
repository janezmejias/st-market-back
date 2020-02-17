package com.st.market.stmarket.api.properties.repository;

import com.st.market.stmarket.api.properties.model.Properties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertiesRepository extends JpaRepository<Properties, Long> {
}
