package com.vk.Quizapp6.cantroller;

import com.vk.Quizapp6.model.Question;
import com.vk.Quizapp6.service.QuestionService;
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
}
