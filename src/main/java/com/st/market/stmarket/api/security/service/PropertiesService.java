package com.st.market.stmarket.api.security.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import com.st.market.stmarket.api.properties.model.Properties;
import com.st.market.stmarket.api.properties.repository.PropertiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author janez
 * @see
 * @version 2019H
 * @since 06-29-2019
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PropertiesService {


    @Autowired
    PropertiesRepository repository;

    private Map<String, String> map;


    @PostConstruct
    private void init() {
        map = new HashMap<>();
        List<Properties> list = repository.findAll();

        for (Properties properties : list) {
            map.put(properties.getName(), properties.getValue());
        }
    }

    public Map<String, String> getMap() {
        return map;
    }
}
