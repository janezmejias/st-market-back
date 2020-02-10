package com.st.market.stmarket.api;

import java.util.Optional;

/**
 *
 * @author janez
 * @param <T>
 */
public interface ServiceBase<T> {

    T save(T model);

    Optional<T> findById(Long id);

    boolean existsById(Long id);

    Iterable<T> findAll();

    long count();

    void deleteById(Long id);

    void delete(T model);

    void deleteAll();

}
