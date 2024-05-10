package com.vk.questionservice.dao;

import com.vk.questionservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Questiondao extends JpaRepository<Question, Integer> {

    List<Question>findByCategory(String category); // data identify by category -> method not in JPA that way we create it

    @Query(value = "SELECT q.id FROM question q where q.category=:category ORDER BY RANDOM() LIMIT :noOfQuestion", nativeQuery = true)
    List<Integer> findrandomeQuestionByCategory(String category, int noOfQuestion);
}
