package com.vk.questionservice.cantroller;

import com.vk.questionservice.model.Question;
import com.vk.questionservice.model.QuestionWrapper;
import com.vk.questionservice.model.Response;
import com.vk.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionCantroller {

    @Autowired
    QuestionService questionservice;

    @GetMapping("questions")
    public ResponseEntity<List<Question>> getallquestions() {
        return questionservice.getAllQuestion();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category) {
        return questionservice.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionservice.addquestion(question);
    }

    @PutMapping("update")
    public String updateQuestion(@RequestBody Question question) {
        return questionservice.updateQuestion(question);
    }

    @DeleteMapping("delete")
    public String deleteQuestion(@RequestBody Question question) {
        return questionservice.deleteQuestion(question);
    }

    // generate
    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionForQuiz(@RequestParam String categoryName, @RequestParam int numQuestion) {
        return questionservice.getQuestionForQuiz(categoryName, numQuestion);
    }

    // getQuestion(questionid)
    @PostMapping("getQuestion")
    public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(@RequestBody List<Integer> questionIds) {
        return questionservice.getQuestionFromId(questionIds);
    }

    // getScore
    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses) {
        return questionservice.getScore(responses);
    }
}
