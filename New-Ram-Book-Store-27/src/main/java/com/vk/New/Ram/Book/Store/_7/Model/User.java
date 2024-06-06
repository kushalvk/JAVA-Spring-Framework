package com.vk.New.Ram.Book.Store._7.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bookuser")
public class User {

    @Id
    private String username;
    private String Password;
}
