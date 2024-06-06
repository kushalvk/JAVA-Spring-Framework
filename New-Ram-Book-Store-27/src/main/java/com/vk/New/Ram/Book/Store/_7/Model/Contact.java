package com.vk.New.Ram.Book.Store._7.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fullname;
    private String email;
    private String msg;
}
