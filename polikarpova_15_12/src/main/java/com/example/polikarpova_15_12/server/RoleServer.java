package com.example.polikarpova_15_12.server;

import com.example.polikarpova_15_12.connect.RoleConnect;
import com.example.polikarpova_15_12.model.Role;

public class RoleServer {

    private RoleConnect roleConnect = new RoleConnect();

    public RoleServer(){}

    public  void saveRole(Role role){

        roleConnect.save(role);


    }

    public Role findRole(int id){
        return roleConnect.findId(id);
    }
}