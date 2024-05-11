package com.vk.Quiz.Service8.model;

import lombok.Data;

@Data
public class QuestionWrapper {

    private int id;
    private String question_title;
    private String op1;
    private String op2;
    private String op3;
    private String op4;

    public QuestionWrapper(int id, String question_title, String op1, String op2, String op3, String op4) {
        this.id = id;
        this.question_title = question_title;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
    }
}
