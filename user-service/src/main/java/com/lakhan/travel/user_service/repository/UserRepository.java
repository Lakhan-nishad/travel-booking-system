package com.lakhan.travel.user_service.repository;

import com.lakhan.travel.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Lakhan Nishad
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUserName(String userName);
}
