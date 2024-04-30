package com.vk.springbootrest9.service;

import com.vk.springbootrest9.model.JobPost;
import com.vk.springbootrest9.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

//    @Autowired
//    private JobRepo repo;
//
//    public void addJob(JobPost jobPost) {
//        repo.addJob(jobPost);
//    }
//
//    public List<JobPost> getAllJobs() {
//        return  repo.getAllJobs();
//    }
//
//    public JobPost getJob(int postId) {
//        return repo.getJob(postId);
//    }
//
//    public void updateJob(JobPost jobPost) {
//        repo.updateJob(jobPost);
//    }
//
//    public void deletejob(int postId) {
//        repo.deletejob(postId);
//    }

//    Data JPA

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return  repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(null); // "OrElse" is use to if data not found then it will give null
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deletejob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(List.of(
            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3, List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4, List.of("Python", "Machine Learning", "Data Analysis")),
            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5, List.of("Networking", "Cisco", "Routing", "Switching")),
            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3, List.of("iOS Development", "Android Development", "Mobile App")),
            new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines", 4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")),
            new JobPost(7, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces", 2, List.of("User Experience", "User Interface Design", "Prototyping")),
            new JobPost(8, "Cybersecurity Analyst", "Protect computer systems and networks from cyber threats", 4, List.of("Cybersecurity", "Network Security", "Incident Response")),
            new JobPost(9, "Full Stack Developer", "Experience in both front-end and back-end development", 5, List.of("JavaScript", "Node.js", "React", "Spring", "MongoDB")),
            new JobPost(10, "Cloud Architect", "Design and implement cloud infrastructure solutions", 6, List.of("Cloud Computing", "AWS", "Azure", "Google Cloud"))
        ));

        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}
