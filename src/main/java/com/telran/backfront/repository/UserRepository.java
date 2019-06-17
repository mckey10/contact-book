package com.telran.backfront.repository;

import com.telran.backfront.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select user.id from User user")
    List<Long> getAllUserId();
    List<User> findAllByFullName(String name);
}
