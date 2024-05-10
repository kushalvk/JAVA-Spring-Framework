package com.vk.questionservice.service;

import com.vk.questionservice.dao.Questiondao;
import com.vk.questionservice.model.Question;
import com.vk.questionservice.model.QuestionWrapper;
import com.vk.questionservice.model.Response;
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

    public ResponseEntity<List<Integer>> getQuestionForQuiz(String categoryName, int numQuestion) {
        List<Integer> questions = questiondao.findrandomeQuestionByCategory(categoryName,numQuestion);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(List<Integer> questionIds) {
        List<QuestionWrapper> wrappers = new ArrayList<>();
        List<Question> questions = new ArrayList<>();
        for (Integer id : questionIds) {
            questions.add(questiondao.findById(id).get());
        }
        for (Question question : questions) {
            QuestionWrapper wrapper = new QuestionWrapper();
            wrapper.setId(question.getId());
            wrapper.setQuestion_title(question.getQuestion_title());
            wrapper.setOp1(question.getOp1());
            wrapper.setOp2(question.getOp2());
            wrapper.setOp3(question.getOp3());
            wrapper.setOp4(question.getOp4());

            wrappers.add(wrapper);
        }

        return new ResponseEntity<>(wrappers, HttpStatus.OK);
    }

    public ResponseEntity<Integer> getScore(List<Response> responses) {
        int right = 0;
        for (Response response : responses) {
            Question question = questiondao.findById(response.getId()).get();
            if (response.getResponse().equals(question.getRight_answer()))
                right++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
