package com.vk.questionservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question_title;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    private String right_answer;
    private String difficulty_level;
    private String category;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion_title() {
        return question_title;
    }
    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }
    public String getOp1() {
        return op1;
    }
    public void setOp1(String op1) {
        this.op1 = op1;
    }
    public String getOp2() {
        return op2;
    }
    public void setOp2(String op2) {
        this.op2 = op2;
    }
    public String getOp3() {
        return op3;
    }
    public void setOp3(String op3) {
        this.op3 = op3;
    }
    public String getOp4() {
        return op4;
    }
    public void setOp4(String op4) {
        this.op4 = op4;
    }
    public String getRight_answer() {
        return right_answer;
    }
    public void setRight_answer(String right_answer) {
        this.right_answer = right_answer;
    }
    public String getDifficulty_level() {
        return difficulty_level;
    }
    public void setDifficulty_level(String difficulty_level) {
        this.difficulty_level = difficulty_level;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
