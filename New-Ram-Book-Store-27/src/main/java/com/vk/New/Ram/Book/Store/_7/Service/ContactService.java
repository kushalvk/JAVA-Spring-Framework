package com.vk.New.Ram.Book.Store._7.Service;

import com.vk.New.Ram.Book.Store._7.Model.Contact;
import com.vk.New.Ram.Book.Store._7.Repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactRepo contactRepo;

    public Contact saveforContect(Contact contact) {
        contactRepo.save(contact);
        return contact;
    }
}
