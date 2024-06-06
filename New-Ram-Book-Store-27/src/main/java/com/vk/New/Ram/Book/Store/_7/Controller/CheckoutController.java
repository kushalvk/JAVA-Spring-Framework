package com.vk.New.Ram.Book.Store._7.Controller;

import com.vk.New.Ram.Book.Store._7.Model.Order;
import com.vk.New.Ram.Book.Store._7.Service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("purchace")
public class CheckoutController {

    @Autowired
    CheckoutService checkoutService;

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
        Order savedOrder = checkoutService.placeOrder(order);
        System.out.println(savedOrder);
        return ResponseEntity.ok(savedOrder);
    }
}
