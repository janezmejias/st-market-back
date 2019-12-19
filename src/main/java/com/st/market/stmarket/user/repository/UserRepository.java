package com.st.market.stmarket.user.repository;

import com.st.market.stmarket.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author janez
 */
public interface UserRepository extends JpaRepository<User, String> {
    
}
