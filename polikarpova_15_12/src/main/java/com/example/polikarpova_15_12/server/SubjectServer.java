package com.example.polikarpova_15_12.server;

import com.example.polikarpova_15_12.connect.SubjectConnect;
import com.example.polikarpova_15_12.model.Subject;

public class SubjectServer {

    private SubjectConnect subjectConnect = new SubjectConnect();

    public SubjectServer(){}

    public  void saveSubject(Subject subject){

        subjectConnect.save(subject);


    }

    public Subject findSubject(int id){
        return subjectConnect.findId(id);
    }
}
