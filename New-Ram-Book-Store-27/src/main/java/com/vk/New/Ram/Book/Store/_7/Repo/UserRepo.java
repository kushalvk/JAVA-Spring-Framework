package com.vk.New.Ram.Book.Store._7.Repo;

import com.vk.New.Ram.Book.Store._7.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
    User findByUsername(String username);
}
