package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.StudentAnswer;



import java.util.List;

public class StudentAnswerConnect extends GeneralConnect<StudentAnswer> {
    public StudentAnswer findId(int id){
        return HibernateServer.getSessionFactory().openSession().get(StudentAnswer.class, id);
    }

    public List<StudentAnswer> findAll(){
        return (List<StudentAnswer>) HibernateServer.getSessionFactory().openSession().createQuery("From StudentAnswer").list();
    }

}