package com.st.market.stmarket;

import com.google.gson.Gson;
import com.st.market.stmarket.menu.model.MainMenu;
import com.st.market.stmarket.menu.repository.MainMenuRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.integration.properties")
public class MainMenuTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    MainMenuRepository repository;

    @Test
    public void proceed() throws Exception {
        repository.deleteAll();

        MainMenu model = new MainMenu();
        model.setName("Inicio");
        model.setPath("/");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Animals-Dog-House-icon.png");
        model.setNeedToAuth(Boolean.FALSE);
        model.setAvailable(Boolean.TRUE);

        save(model);

        model = new MainMenu();
        model.setName("Tienda");
        model.setPath("/products");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Business-Shop-icon.png");
        model.setNeedToAuth(Boolean.FALSE);
        model.setAvailable(Boolean.TRUE);

        save(model);

        model = new MainMenu();
        model.setName("Carrito");
        model.setPath("/cart");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Ecommerce-Buy-icon.png");
        model.setNeedToAuth(Boolean.TRUE);
        model.setAvailable(Boolean.TRUE);

        save(model);

        model = new MainMenu();
        model.setName("Direcciones");
        model.setPath("/address");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Cinema-Adventures-icon.png");
        model.setNeedToAuth(Boolean.TRUE);
        model.setAvailable(Boolean.TRUE);

        save(model);

        model = new MainMenu();
        model.setName("Ordenes");
        model.setPath("/orders");
        model.setImage("http://icons.iconarchive.com/icons/icons8/windows-8/64/Ecommerce-Shopping-Bag-icon.png");
        model.setNeedToAuth(Boolean.TRUE);
        model.setAvailable(Boolean.TRUE);

        save(model);

    }

    private void save(MainMenu model) throws Exception {
        Gson gson = new Gson();
        String o = gson.toJson(model);

        mockMvc.perform(post(o))
                .andExpect(status().isOk());
    }

    private RequestBuilder post(String o) {
        return MockMvcRequestBuilders
                .post("/api/v1/options/create", o)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(o);
    }
}
