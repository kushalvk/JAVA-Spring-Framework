package com.vk.Jobapp;

import com.vk.Jobapp.model.JobPost;
import com.vk.Jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class jobController {

    @GetMapping({"/", "home"}) // get Request(url)
    public String home() {
        return "home"; // (home.jsp)
    }

//    @GetMapping("addjob") // get Request(url)
//    public String add() {
//        return "addjob"; // (addjob.jsp)
//    }
//
//    @Autowired
//    private JobService service;
//
//    @PostMapping("handleForm") // post Request(url)
//    public String handleform(JobPost jobpost) {
//        service.addJob(jobpost);
//        return "success"; // (success.jsp)
//    }
//
//    @GetMapping("viewalljobs")
//    public String viewalljobs(Model m) {
//        List<JobPost> jobs = service.getAllJobs();
//        m.addAttribute("jobPosts", jobs);
//        return "viewalljobs";
//    }
}
