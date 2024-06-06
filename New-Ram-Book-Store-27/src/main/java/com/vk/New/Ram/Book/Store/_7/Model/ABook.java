package com.vk.New.Ram.Book.Store._7.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "abook")
public class ABook {

    @Id
    private String bookname;
    private int price;
    private String description;
    private String image;
}
