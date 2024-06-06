package com.vk.New.Ram.Book.Store._7.Controller;

import com.vk.New.Ram.Book.Store._7.Model.Contact;
import com.vk.New.Ram.Book.Store._7.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("send-message")
public class ContactController {

    @GetMapping
    public String cont() {
        return "Your Details are submited our team will contect to you soon...!";
    }

    @Autowired
    ContactService contactService;

    @PostMapping
    public ResponseEntity<Contact> saveDetails(@RequestBody Contact contact) {
        Contact cnt = contactService.saveforContect(contact);
        System.out.println(cnt);
        return ResponseEntity.ok(cnt);
    }
}
