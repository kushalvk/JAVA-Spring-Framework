package com.vk.Quiz.Service8.dao;

import com.vk.Quiz.Service8.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Quizdao extends JpaRepository<Quiz, Integer> {

}
