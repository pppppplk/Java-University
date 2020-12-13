package com.example.polikarpova_15_12.connect;

import com.example.polikarpova_15_12.hibernate.HibernateServer;
import com.example.polikarpova_15_12.model.Schedule;



import java.util.List;

public class ScheduleConnect extends GeneralConnect<Schedule> {
    public Schedule findId(int id){
        return HibernateServer.getSessionFactory().openSession().get(Schedule.class, id);
    }

    public List<Schedule> findAll(){
        return (List<Schedule>) HibernateServer.getSessionFactory().openSession().createQuery("From Schedule").list();
    }

}