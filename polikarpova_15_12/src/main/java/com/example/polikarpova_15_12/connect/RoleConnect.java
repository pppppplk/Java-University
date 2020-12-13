package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.Role;



import java.util.List;

public class RoleConnect extends GeneralConnect<Role> {
    public Role findId(int id){
        return HibernateServer.getSessionFactory().openSession().get(Role.class, id);
    }

    public List<Role> findAll(){
        return (List<Role>) HibernateServer.getSessionFactory().openSession().createQuery("From Role").list();
    }

}