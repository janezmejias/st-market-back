package com.st.market.stmarket.user.service;

import com.st.market.stmarket.api.ServiceBase;
import com.st.market.stmarket.user.model.User;

/**
 *
 * @author janez
 */
public interface UserService extends ServiceBase<User> {

    User findByEmail(String email);

}
