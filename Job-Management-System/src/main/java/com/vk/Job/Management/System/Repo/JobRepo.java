package com.vk.Job.Management.System.Repo;

import com.vk.Job.Management.System.Model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepo extends JpaRepository<Job, String> {

    List<Job> findByFiald(
            String fiald
    );
}
