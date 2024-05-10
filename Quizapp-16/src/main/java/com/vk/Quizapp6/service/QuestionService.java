package com.vk.Quizapp6.service;

import com.vk.Quizapp6.dao.Questiondao;
import com.vk.Quizapp6.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    Questiondao questiondao;

    // request Entity -> to give a request to the server
    public ResponseEntity<List<Question>> getAllQuestion() { // to handle a exception (we can also apply from other method.
        try {
            return new ResponseEntity<>(questiondao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public List<Question> getQuestionByCategory(String category) {
        return questiondao.findByCategory(category);
    }

    // response Entity -> to give a response to the server
    public ResponseEntity<String> addquestion(Question question) {
        questiondao.save(question);
        return new ResponseEntity<>("Adding Success", HttpStatus.CREATED);
    }

    public String deleteQuestion(Question question) {
        questiondao.delete(question);
        return "Delete Done";
    }

    public String updateQuestion(Question question) {
        questiondao.save(question);
        return "Update Done";
    }
}
