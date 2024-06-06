package com.vk.New.Ram.Book.Store._7.Service;

import com.vk.New.Ram.Book.Store._7.Model.Book;
import com.vk.New.Ram.Book.Store._7.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
}
