package com.vk.Job.Management.System.Controller;

import com.vk.Job.Management.System.Model.Job;
import com.vk.Job.Management.System.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public String job(Model model) {
        List<Job> Job = jobService.jobs();
        model.addAttribute("Job", Job);
        return "Job";
    }

    @GetMapping("/search")
    public String search(@RequestParam String search, Model model) {
        List<Job> Job = jobService.searchJobs(search);
        model.addAttribute("Job", Job);
        return "Job";
    }
}
