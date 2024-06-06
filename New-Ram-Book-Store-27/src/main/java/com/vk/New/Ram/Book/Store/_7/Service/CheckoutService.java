package com.vk.New.Ram.Book.Store._7.Service;

import com.vk.New.Ram.Book.Store._7.Model.Order;
import com.vk.New.Ram.Book.Store._7.Repo.OrderRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    @Autowired
    OrderRepo orderRepo;

    @Transactional
    public Order placeOrder(Order order) {
        // Business logic for placing an order
        return orderRepo.save(order);
    }
}
