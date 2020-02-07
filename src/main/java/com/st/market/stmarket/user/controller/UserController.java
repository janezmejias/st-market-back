package com.st.market.stmarket.user.controller;

import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import com.st.market.stmarket.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.st.market.stmarket.user.service.UserService;
import org.springframework.context.annotation.Lazy;

/**
 *
 * @author janez
 */
@RestController
@RequestMapping(Constants.URI_USER)
@Lazy
@CrossOrigin
public class UserController extends ControllerBase<User> {

    @Autowired
    public UserController(UserService service) {
        super(service);
    }

}
