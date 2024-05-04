package com.vk.springbootrest9.repo;

import com.vk.springbootrest9.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);

}