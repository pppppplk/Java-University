package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.Group;



import java.util.List;

public class GroupConnect extends GeneralConnect<Group> {
    public Group findId(int id){
        return HibernateServer.getSessionFactory().openSession().get(Group.class, id);
    }

    public List<Group> findAll(){
        return (List<Group>) HibernateServer.getSessionFactory().openSession().createQuery("From Group").list();
    }

}