package com.st.market.stmarket.address.controller;

import com.st.market.stmarket.address.model.Address;
import com.st.market.stmarket.address.service.AddressService;
import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.ControllerBase;
import com.st.market.stmarket.order.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constants.URI_ADDRESS)
@Lazy
@CrossOrigin
public class AddressController extends ControllerBase<Address> {

    @Autowired
    AddressService service;

    @Autowired
    public AddressController(AddressService service) {
        super(service);
    }

    @GetMapping(Constants.FIND_BY_USER_ID)
    @ResponseBody
    ResponseEntity<?> findBy(@RequestParam("userId") Long userId) {
        try {
            List<Address> list = service.findByUserId(userId);
            return new ResponseEntity(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
