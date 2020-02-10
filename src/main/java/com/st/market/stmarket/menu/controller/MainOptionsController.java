package com.st.market.stmarket.menu.controller;

import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import com.st.market.stmarket.menu.model.MainMenu;
import com.st.market.stmarket.menu.services.MainMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author janez
 */
@RestController
@RequestMapping(Constants.URI_OPTIONS)
@Lazy
@CrossOrigin
public class MainOptionsController extends ControllerBase<MainMenu> {


    @Autowired
    public MainOptionsController(MainMenuService service) {
        super(service);
    }
}
