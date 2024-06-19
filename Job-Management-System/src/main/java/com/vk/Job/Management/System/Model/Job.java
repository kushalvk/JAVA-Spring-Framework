package com.vk.Job.Management.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Job")
public class Job {

    @Id
    private String name;
    private String fiald;
    private String fend;
    private String bend;
    private String num;
}
