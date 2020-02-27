package com.st.market.stmarket;

import com.st.market.stmarket.api.properties.model.Properties;
import com.st.market.stmarket.api.properties.repository.PropertiesRepository;
import com.st.market.stmarket.menu.model.MainMenu;
import com.st.market.stmarket.menu.repository.MainMenuRepository;
import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.repository.ProductRepository;
import java.math.BigDecimal;
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
public class InitialTest {

    @Autowired
    PropertiesRepository repository;
    @Autowired
    MainMenuRepository mainMenuRepository;
    @Autowired
    ProductRepository productRepository;

    @Test
    public void proceed() throws Exception {
        repository.deleteAll();
        for (int index = 2; index < 10; index++) {
            Product model = new Product();
            model.setTitle("title product " + index);
            model.setName("product _ " + index);
            model.setImage("assets/img/product/c-product-" + index + ".jpg");
            model.setOldPrice(new BigDecimal(index * 2));
            model.setNewPrice(new BigDecimal(index));
            model.setDiscount(30);
            model.setAvailable(index + 0L);
            model.setDescription("--description here--");

            productRepository.save(model);
        }
    }

    @Test
    public void loadProperties() throws Exception {
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

    @Test
    public void mainMenu() throws Exception {
        mainMenuRepository.deleteAll();

        MainMenu model = new MainMenu();
        model.setName("Inicio");
        model.setPath("/");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Animals-Dog-House-icon.png");
        model.setNeedToAuth(Boolean.FALSE);
        model.setAvailable(Boolean.TRUE);

        mainMenuRepository.save(model);

        model = new MainMenu();
        model.setName("Tienda");
        model.setPath("/products");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Business-Shop-icon.png");
        model.setNeedToAuth(Boolean.FALSE);
        model.setAvailable(Boolean.TRUE);

        mainMenuRepository.save(model);

        model = new MainMenu();
        model.setName("Carrito");
        model.setPath("/cart");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Ecommerce-Buy-icon.png");
        model.setNeedToAuth(Boolean.TRUE);
        model.setAvailable(Boolean.TRUE);

        mainMenuRepository.save(model);

        model = new MainMenu();
        model.setName("Direcciones");
        model.setPath("/address");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Cinema-Adventures-icon.png");
        model.setNeedToAuth(Boolean.TRUE);
        model.setAvailable(Boolean.TRUE);

        mainMenuRepository.save(model);

        model = new MainMenu();
        model.setName("Ordenes");
        model.setPath("/orders");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Ecommerce-Shopping-Bag-icon.png");
        model.setNeedToAuth(Boolean.TRUE);
        model.setAvailable(Boolean.TRUE);

        mainMenuRepository.save(model);

    }

}
