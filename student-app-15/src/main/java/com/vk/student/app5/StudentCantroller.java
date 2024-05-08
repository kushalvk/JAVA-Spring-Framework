package com.vk.student.app5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentCantroller {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudent")
    public List<Student> getStudent() {
        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent() {
        Student s = new Student();
        s.setName("raj");
        s.setAge(20);

        repo.save(s);
    }
}
