package com.vk.Quiz.Service8.service;

import com.vk.Quiz.Service8.dao.Quizdao;
import com.vk.Quiz.Service8.feign.QuizeInterface;
import com.vk.Quiz.Service8.model.QuestionWrapper;
import com.vk.Quiz.Service8.model.Quiz;
import com.vk.Quiz.Service8.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    Quizdao quizdao;

    @Autowired
    QuizeInterface quizeInterface;

    public ResponseEntity<String> createQuiz(String category, int noOfQuestion, String title) {

        List<Integer> question = quizeInterface.getQuestionForQuiz(category, noOfQuestion).getBody();
        Quiz quiz = new Quiz();
        quiz.getTitle();
        quiz.setQuestionIds(question);
        quizdao.save(quiz);

        return new ResponseEntity<>("Quiz Created", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(int id) {
        Quiz quiz = quizdao.findById(id).get();
        List<Integer> questionIds = quiz.getQuestionIds();
        ResponseEntity<List<QuestionWrapper>> questions = quizeInterface.getQuestionFromId(questionIds);

        return questions;
    }

    public ResponseEntity<Integer> calculateResult(int id, List<Response> responses) {

        ResponseEntity<Integer> score = quizeInterface.getScore(responses);

        return score;
    }
}
