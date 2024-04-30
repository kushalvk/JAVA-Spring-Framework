package com.vk.Spring.data.rest.demo1.repo;

import com.vk.Spring.data.rest.demo1.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

}