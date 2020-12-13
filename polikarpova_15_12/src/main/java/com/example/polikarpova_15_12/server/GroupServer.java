package com.example.polikarpova_15_12.server;

import com.example.polikarpova_15_12.connect.GroupConnect;
import com.example.polikarpova_15_12.model.Group;

public class GroupServer {

    private GroupConnect groupConnect = new GroupConnect();

    public GroupServer(){}

    public  void saveGroup(Group group){

        groupConnect.save(group);


    }

    public Group findGroup(int id){
        return groupConnect.findId(id);
    }
}
