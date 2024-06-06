package com.vk.New.Ram.Book.Store._7.Service;

import com.vk.New.Ram.Book.Store._7.Model.ABook;
import com.vk.New.Ram.Book.Store._7.Repo.ABookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ABookService {

    @Autowired
    ABookRepo aBookRepo;

    public List<ABook> getAllABooks() {
        return aBookRepo.findAll();
    }
}
