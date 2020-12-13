package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.Question;



import java.util.List;

public class QuestionConnect extends GeneralConnect<Question> {
    public Question findId(int id){
        return HibernateServer.getSessionFactory().openSession().get(Question.class, id);
    }

    public List<Question> findAll(){
        return (List<Question>) HibernateServer.getSessionFactory().openSession().createQuery("From Question").list();
    }

}