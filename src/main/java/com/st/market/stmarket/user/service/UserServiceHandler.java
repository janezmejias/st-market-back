package com.st.market.stmarket.user.service;

import com.st.market.stmarket.user.model.User;
import com.st.market.stmarket.user.repository.UserRepository;
import java.sql.Timestamp;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 *
 * @author janez
 */
@Service
@Lazy
public class UserServiceHandler implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User save(User s) {
        User usr = repository.findByEmail(s.getEmail());
        if (usr == null) {
            usr = repository.save(s);
            return usr;
        }
        usr.setLastSign(new Timestamp(System.currentTimeMillis()));
        return usr;
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
    public void deleteAll() {
        repository.deleteAll();
    }

}