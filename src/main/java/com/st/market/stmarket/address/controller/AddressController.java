package com.st.market.stmarket.address.controller;

import com.st.market.stmarket.address.model.Address;
import com.st.market.stmarket.address.service.AddressService;
import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.URI_ADDRESS)
@Lazy
@CrossOrigin
public class AddressController extends ControllerBase<Address> {

    @Autowired
    public AddressController(AddressService service) {
        super(service);
    }
}
