package com.vk.Job.Management.System.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contact")
public class ContactContoller {

    @GetMapping
    public String contact() {
        return "Contact";
    }
}
