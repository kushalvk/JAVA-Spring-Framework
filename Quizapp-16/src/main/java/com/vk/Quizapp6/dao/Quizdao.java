package com.vk.Quizapp6.dao;

import com.vk.Quizapp6.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Quizdao extends JpaRepository<Quiz, Integer> {

}
