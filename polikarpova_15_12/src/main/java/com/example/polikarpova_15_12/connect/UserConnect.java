package com.example.polikarpova_15_12.connect;


import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.User;



import java.util.List;

public class UserConnect extends GeneralConnect<User> {
    public User findId(int id) {
        return HibernateServer.getSessionFactory().openSession().get(User.class, id);
    }

    public List<User> findAll() {
        return (List<User>) HibernateServer.getSessionFactory().openSession().createQuery("From User").list();
    }
}
