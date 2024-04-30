package com.vk.springbootrest9;

import com.vk.springbootrest9.model.JobPost;
import com.vk.springbootrest9.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping(path="jobPosts", produces = {"application/json"}) // get all Jobs , "produces = {"application/json"}" it's return only json data not a xml
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{post}") // get one Jobs
    public JobPost getJob(@PathVariable("post") int postId) { // for fiend a path variable
        return service.getJob(postId);
    }

    @PostMapping(path = "jobPost", consumes = {"application/xml"}) // '@PostMapping' is use to the send data to the server, "consumes = {"application/xml"}" it will send only xml data not a json
    public void addJob(@RequestBody JobPost jobPost){ // '@RequestBody' is use to the send the data to the server.
        service.addJob(jobPost);
    }

    @PutMapping("jobPost")
    public JobPost updatejob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deletejob(@PathVariable int postId) {
        service.deletejob(postId);
        return "Deleted";
    }

//    JPA

    @GetMapping("load")
    public String loadData() {

        service.load();

        return "Success";
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return service.search(keyword);
    }
}
