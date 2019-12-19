package com.st.market.stmarket;

import com.google.gson.Gson;
import com.st.market.stmarket.user.model.User;
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

/**
 *
 * @author janez
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.integration.properties")
public class UserTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void proceed() throws Exception {
        for (int index = 1; index < 11; index++) {
            User model = new User();            
            model.setName("janez " + index);
            model.setLastName("anezmejias _ " + index);
            model.setCompleteName(model.getName() + " " + model.getLastName());
            model.setEmail("janezmejias.09@gmail.com");
            model.setPhotoUrl("https://lh3.googleusercontent.com/a-/AAuE7mDpylni6Ve6Oj3OXOxoFnZSggCSxxWfUUoPj_oD");            

            Gson gson = new Gson();
            String o = gson.toJson(model);

            mockMvc.perform(post(o))
                    .andExpect(status().isOk());
        }

    }

    private RequestBuilder post(String o) {
        return MockMvcRequestBuilders
                .post("/api/v1/user", o)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(o);
    }

}
