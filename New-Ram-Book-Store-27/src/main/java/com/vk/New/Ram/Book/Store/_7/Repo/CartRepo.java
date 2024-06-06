package com.vk.New.Ram.Book.Store._7.Repo;

import com.vk.New.Ram.Book.Store._7.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, String> {
    void deleteById(int id);
}
