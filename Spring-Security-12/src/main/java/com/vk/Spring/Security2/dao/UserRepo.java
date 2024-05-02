package com.vk.Spring.Security2.dao;

import com.vk.Spring.Security2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);

}
