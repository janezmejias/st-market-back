package com.st.market.stmarket.address.service;

import com.st.market.stmarket.address.model.Address;
import com.st.market.stmarket.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceHandler implements AddressService {

    @Autowired
    AddressRepository repository;

    @Override
    public List<Address> findByUserId(Long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public Address save(Address model) throws Exception {
        return repository.save(model);
    }

    @Override
    public Optional<Address> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Iterable<Address> findAll() {
        return repository.findAll();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(Address model) {
        repository.delete(model);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
