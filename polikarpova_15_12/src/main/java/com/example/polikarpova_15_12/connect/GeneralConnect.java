package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class GeneralConnect<TEntity> {
    public void save(TEntity model){
        Session session = HibernateServer.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(model);
        tx1.commit();
        session.close();
    }

    public void update(TEntity model){
        Session session = HibernateServer.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(model);
        tx1.commit();
        session.close();
    }

    public void delete(TEntity model) {
        Session session = HibernateServer.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(model);
        tx1.commit();
        session.close();
    }
}