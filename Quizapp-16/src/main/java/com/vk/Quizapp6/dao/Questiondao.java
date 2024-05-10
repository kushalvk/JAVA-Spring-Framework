package com.vk.Quizapp6.dao;

import com.vk.Quizapp6.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Questiondao extends JpaRepository<Question, Integer> {

    List<Question>findByCategory(String category); // data identify by category -> method not in JPA that way we create it

    @Query(value = "SELECT * FROM question q where q.category=:category ORDER BY RANDOM() LIMIT :noOfQuestion", nativeQuery = true)
    List<Question> findrandomeQuestionByCategory(String category, int noOfQuestion);
}
