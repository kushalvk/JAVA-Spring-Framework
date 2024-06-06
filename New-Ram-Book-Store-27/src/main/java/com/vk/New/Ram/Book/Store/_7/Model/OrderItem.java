package com.vk.New.Ram.Book.Store._7.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @NotNull
    private String bookTitle;

    @NotNull
    private int quantity;

    @NotNull
    private double price;
}
