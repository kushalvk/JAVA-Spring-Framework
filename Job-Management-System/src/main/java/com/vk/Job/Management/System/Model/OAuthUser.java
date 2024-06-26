package com.vk.Job.Management.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "oauthuser")
public class OAuthUser {

    @Id
    private String email;
    private String name;
}
