package com.vk.Quizapp6.service;

import com.vk.Quizapp6.dao.Questiondao;
import com.vk.Quizapp6.dao.Quizdao;
import com.vk.Quizapp6.model.Question;
import com.vk.Quizapp6.model.QuestionWrapper;
import com.vk.Quizapp6.model.Quiz;
import com.vk.Quizapp6.model.Response;
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
    Questiondao questiondao;

    public ResponseEntity<String> createQuiz(String category, int noOfQuestion, String title) {

        List<Question> questions = questiondao.findrandomeQuestionByCategory(category,noOfQuestion);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);

        quizdao.save(quiz);
        return new ResponseEntity<>("Quiz Created", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(int id) {
        Optional<Quiz> quiz = quizdao.findById(id);
        List<Question> questionFromDB = quiz.get().getQuestions();

        List<QuestionWrapper> QuestionForUser = new ArrayList<>();
        for (Question q: questionFromDB) {
            QuestionWrapper qw = new QuestionWrapper( q.getId(), q.getQuestion_title(), q.getOp1(), q.getOp2(), q.getOp3(), q.getOp4());
            QuestionForUser.add(qw);
        }

        return new ResponseEntity<>(QuestionForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(int id, List<Response> responses) {
        Quiz quiz = quizdao.findById(id).get();

        List<Question> questions = quiz.getQuestions();

        int right = 0;
        int i = 0;
        for (Response response : responses) {
            if (response.getResponse().equals(questions.get(i).getRight_answer()))
                right++;
            i++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
