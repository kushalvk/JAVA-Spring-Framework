package com.vk.New.Ram.Book.Store._7.Service;

import com.vk.New.Ram.Book.Store._7.Model.EBook;
import com.vk.New.Ram.Book.Store._7.Repo.EBookRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EBookService {

    @Autowired
    EBookRepo eBookRepo;

    public List<EBook> getAllEBooks() {
        return eBookRepo.findAll();
    }
}
