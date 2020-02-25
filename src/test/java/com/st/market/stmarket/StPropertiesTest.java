package com.st.market.stmarket;

import com.st.market.stmarket.api.properties.model.Properties;
import com.st.market.stmarket.api.properties.repository.PropertiesRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.integration.properties")
public class StPropertiesTest {

    @Autowired
    PropertiesRepository repository;

    @Test
    public void proceed() throws Exception {
        Properties properties = new Properties();
        repository.deleteAll();

        properties.setName("SECRET_KEY");
        properties.setValue("janezmejias");
        repository.save(properties);

        properties = new Properties();
        properties.setName("EXPIRATION_TIME");
        properties.setValue("10000");
        repository.save(properties);
    }
}
