package com.st.market.stmarket.user.service;

import com.st.market.stmarket.user.model.User;
import com.st.market.stmarket.user.repository.UserRepository;
import java.sql.Timestamp;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author janez
 */
@Service
public class UserServiceHandler implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User findByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <S extends User> S save(S s) {
        User usr = repository.findByEmail(s.getEmail());
        if (usr == null) {
            usr = repository.save(s);
            return (S) usr;
        }
        usr.setLastSign(new Timestamp(System.currentTimeMillis()));
        return repository.save(s);
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> itrbl) {
        return repository.saveAll(itrbl);
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Iterable<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> itrbl) {
        return repository.findAllById(itrbl);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(User t) {
        repository.delete(t);
    }

    @Override
    public void deleteAll(Iterable<? extends User> itrbl) {
        repository.deleteAll(itrbl);;
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

}
