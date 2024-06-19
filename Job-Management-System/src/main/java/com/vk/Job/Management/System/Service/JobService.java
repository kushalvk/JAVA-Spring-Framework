package com.vk.Job.Management.System.Service;

import com.vk.Job.Management.System.Model.Job;
import com.vk.Job.Management.System.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public List<Job> jobs() {
        return jobRepo.findAll();
    }

    public List<Job> searchJobs(String keyword) {
        return jobRepo.findByFiald(keyword);
    }
}
