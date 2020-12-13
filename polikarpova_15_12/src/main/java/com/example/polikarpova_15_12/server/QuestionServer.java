package com.example.polikarpova_15_12.server;

import com.example.polikarpova_15_12.connect.QuestionConnect;
import com.example.polikarpova_15_12.model.Question;

public class QuestionServer {

    private QuestionConnect questionConnect = new QuestionConnect();

    public QuestionServer(){}

    public  void saveQuestion(Question question){

        questionConnect.save(question);


    }

    public Question findQuestion(int id){
        return questionConnect.findId(id);
    }
}