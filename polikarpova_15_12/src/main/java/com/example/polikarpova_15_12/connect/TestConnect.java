package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.Test;



import java.util.List;

public class TestConnect extends GeneralConnect<Test> {
    public Test findId(int id){
        return HibernateServer.getSessionFactory().openSession().get(Test.class, id);
    }

    public List<Test> findAll(){
        return (List<Test>) HibernateServer.getSessionFactory().openSession().createQuery("From Test").list();
    }

}