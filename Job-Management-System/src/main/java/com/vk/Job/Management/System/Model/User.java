package com.vk.Job.Management.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "jobmUser")
public class User {

    @Id
    private String username;
    private String password;
}
