package com.example.polikarpova_15_12.server;


import com.example.polikarpova_15_12.connect.StudentAnswerConnect;
import com.example.polikarpova_15_12.model.StudentAnswer;

public class StudentAnswerServer {

    private StudentAnswerConnect studentAnswerConnect = new StudentAnswerConnect();

    public StudentAnswerServer(){}

    public  void saveStudentAnswer(StudentAnswer studentAnswer){

        studentAnswerConnect.save(studentAnswer);


    }

    public StudentAnswer findStudentAnswer(int id){
        return studentAnswerConnect.findId(id);
    }
}
