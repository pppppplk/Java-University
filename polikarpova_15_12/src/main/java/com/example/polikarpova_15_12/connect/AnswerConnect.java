package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.Answer;



import java.util.List;

public class AnswerConnect extends GeneralConnect<Answer> {
    public Answer findId(int id){
        return HibernateServer.getSessionFactory().openSession().get(Answer.class, id);
    }

    public List<Answer> findAll(){
        return (List<Answer>) HibernateServer.getSessionFactory().openSession().createQuery("From Answer").list();
    }

}