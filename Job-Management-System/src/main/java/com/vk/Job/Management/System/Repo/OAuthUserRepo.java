package com.vk.Job.Management.System.Repo;

import com.vk.Job.Management.System.Model.OAuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuthUserRepo extends JpaRepository<OAuthUser, String> {

}
