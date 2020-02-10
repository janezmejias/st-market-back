package com.st.market.stmarket.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;

/**
 *
 * @author janez
 * @param <T>
 */
public abstract class ControllerBase<T> {

    private final ServiceBase<T> service;

    public ControllerBase(ServiceBase<T> service) {
        this.service = service;
    }

    @GetMapping(Constants.HTTP_GET_ALL)
    @ResponseBody
    ResponseEntity<?> listAll() {
        try {
            return new ResponseEntity(service.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(Constants.HTTP_GET_ONE)
    @ResponseBody
    ResponseEntity<?> getById(@RequestParam("id") Long id) {
        try {
            return new ResponseEntity(service.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(Constants.HTTP_POST)
    @ResponseBody
    ResponseEntity<?> create(@RequestBody T model) {
        try {
            return new ResponseEntity(service.save(model), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(Constants.HTTP_PUT)
    @ResponseBody
    ResponseEntity<?> update(@RequestBody T model) {
        try {
            return new ResponseEntity(service.save(model), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(Constants.HTTP_DELETE)
    @ResponseBody
    ResponseEntity<?> delete(@RequestParam("id") Long id) {
        try {
            service.deleteById(id);
            return new ResponseEntity(1, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
