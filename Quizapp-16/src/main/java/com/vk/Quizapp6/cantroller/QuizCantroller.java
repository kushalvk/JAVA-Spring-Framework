package com.vk.Quizapp6.cantroller;

import com.vk.Quizapp6.model.Question;
import com.vk.Quizapp6.model.QuestionWrapper;
import com.vk.Quizapp6.model.Response;
import com.vk.Quizapp6.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizCantroller {

    @Autowired
    QuizService quizservice;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam int noOfQuestion,@RequestParam String title) {
        return quizservice.createQuiz(category, noOfQuestion, title);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizeQuestion(@PathVariable int id) {
        return quizservice.getQuizQuestion(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable int id, @RequestBody List<Response> responses) {
        return quizservice.calculateResult(id, responses);
    }
}
