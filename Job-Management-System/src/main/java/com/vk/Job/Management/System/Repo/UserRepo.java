package com.vk.Job.Management.System.Repo;

import com.vk.Job.Management.System.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
    User findByusername(String username);
}
