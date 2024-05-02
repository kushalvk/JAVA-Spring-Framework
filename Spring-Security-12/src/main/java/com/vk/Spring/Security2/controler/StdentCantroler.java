package com.vk.Spring.Security2.controler;

import com.vk.Spring.Security2.model.Studemt;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StdentCantroler {

    List<Studemt> students = new ArrayList<>(List.of(
            new Studemt(1,"kushal","java"),
            new Studemt(2,"om","python"),
            new Studemt(3,"harshad","C"),
            new Studemt(4,"prince","C++"),
            new Studemt(5,"vijay","CSS")
    ));

    @GetMapping("students")
    public List<Studemt> getstdent() {
        return students;
    }

    // CSRF Token for name of input(Add data)
    // this method is for get csrf token
    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("student")
    public void addStudent(@RequestBody Studemt student) {
        students.add(student);
    }
}
