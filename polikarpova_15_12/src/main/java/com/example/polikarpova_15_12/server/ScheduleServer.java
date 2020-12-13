package com.example.polikarpova_15_12.server;


import com.example.polikarpova_15_12.connect.ScheduleConnect;
import com.example.polikarpova_15_12.model.Schedule;

public class ScheduleServer {

    private ScheduleConnect scheduleConnect = new ScheduleConnect();

    public ScheduleServer(){}

    public  void saveSchedule(Schedule schedule){
        scheduleConnect.save(schedule);


    }

    public Schedule findRole(int id){
        return scheduleConnect.findId(id);
    }
}