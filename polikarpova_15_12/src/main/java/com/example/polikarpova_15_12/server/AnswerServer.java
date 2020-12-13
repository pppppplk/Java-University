package com.example.polikarpova_15_12.server;

import com.example.polikarpova_15_12.connect.AnswerConnect;
import com.example.polikarpova_15_12.model.Answer;

public class AnswerServer {

    private AnswerConnect answerConnect = new AnswerConnect();

    public AnswerServer(){}

    public  void saveAnswer(Answer answer){

        answerConnect.save(answer);


    }

    public Answer findAnswer(int id){
        return answerConnect.findId(id);
    }
}
