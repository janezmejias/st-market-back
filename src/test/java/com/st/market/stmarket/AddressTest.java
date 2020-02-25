package com.st.market.stmarket;

import com.google.gson.Gson;
import com.st.market.stmarket.address.model.Address;
import com.st.market.stmarket.address.repository.AddressRepository;
import com.st.market.stmarket.order.model.Order;
import com.st.market.stmarket.order.repository.OrderRepository;
import org.junit.Test;
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
public class AddressTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    AddressRepository repository;

    @Test
    public void proceed() throws Exception {
        Address model = new Address();
        model.setAsentamiento("caiman");
        model.setAsentamientoTipo("barrio");
        model.setCountry("MEXICO");
        model.setLocalidad("Keneddy");
        model.setMunicipio("Cundinamarca");
        model.setNumeroExterior("1103");
        model.setState("Bogota");

        Gson gson = new Gson();
        String o = gson.toJson(model);

        repository.save(model);

        /*
        mockMvc.perform(post(o))
                .andExpect(status().isOk());
         */

    }

    private RequestBuilder post(String o) {
        return MockMvcRequestBuilders
                .post("/api/v1/order/create", o)
                .contentType(MediaType.APPLICATION_JSON)
                .content(o);
    }
}