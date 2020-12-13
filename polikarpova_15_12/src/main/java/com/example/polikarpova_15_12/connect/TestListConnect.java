package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.TestList;



import java.util.List;

public class TestListConnect extends GeneralConnect<TestList> {
    public TestList findId(int id){
        return HibernateServer.getSessionFactory().openSession().get(TestList.class, id);
    }

    public List<TestList> findAll(){
        return (List<TestList>) HibernateServer.getSessionFactory().openSession().createQuery("From TestList").list();
    }

}