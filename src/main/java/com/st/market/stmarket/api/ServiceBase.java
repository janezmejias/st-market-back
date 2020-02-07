package com.st.market.stmarket.api;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author janez
 * @param <T>
 */
public interface ServiceBase<T> extends CrudRepository<T, Long> {

}
