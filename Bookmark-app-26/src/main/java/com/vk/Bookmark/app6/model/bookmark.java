package com.vk.Bookmark.app6.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bookmark")
public class bookmark {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String Password;
}
