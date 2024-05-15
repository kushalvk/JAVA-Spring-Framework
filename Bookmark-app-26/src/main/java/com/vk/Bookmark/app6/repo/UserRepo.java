package com.vk.Bookmark.app6.Repo;

import com.vk.Bookmark.app6.Model.bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<bookmark, Integer> {
    bookmark findByUsername(String username);
}
