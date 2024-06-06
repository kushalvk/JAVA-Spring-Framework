package com.vk.New.Ram.Book.Store._7.Service;

import com.vk.New.Ram.Book.Store._7.Model.Book;
import com.vk.New.Ram.Book.Store._7.Model.Cart;
import com.vk.New.Ram.Book.Store._7.Repo.CartRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepo cartRepo;

    public void AddToCart (Book book) {
        Cart cart = new Cart();
        cart.setBook(book);
        cart.setQuantity(1);
        cartRepo.save(cart);
    }

    public List<Cart> gatCartItarm() {
        return cartRepo.findAll();
    }

    @Transactional
    public void removeBook(int id) {
        cartRepo.deleteById(id);
    }
}
