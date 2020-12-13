package com.example.polikarpova_15_12.hibernate;


import com.example.polikarpova_15_12.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateServer {
    private static SessionFactory sessionFactory;

    private HibernateServer(){}

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            try{
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Answer.class);
                configuration.addAnnotatedClass(Group.class);
                configuration.addAnnotatedClass(Question.class);
                configuration.addAnnotatedClass(Role.class);
                configuration.addAnnotatedClass(Schedule.class);
                configuration.addAnnotatedClass(StudentAnswer.class);
                configuration.addAnnotatedClass(Subject.class);
                configuration.addAnnotatedClass(Test.class);
                configuration.addAnnotatedClass(TestList.class);
                configuration.addAnnotatedClass(User.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;

    }
}