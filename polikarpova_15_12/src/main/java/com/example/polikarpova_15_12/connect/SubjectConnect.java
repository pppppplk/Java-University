package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.Subject;



import java.util.List;

public class SubjectConnect extends GeneralConnect<Subject> {
    public Subject findId(int id){
        return HibernateServer.getSessionFactory().openSession().get(Subject.class, id);
    }

    public List<Subject> findAll(){
        return (List<Subject>) HibernateServer.getSessionFactory().openSession().createQuery("From Subject").list();
    }

}