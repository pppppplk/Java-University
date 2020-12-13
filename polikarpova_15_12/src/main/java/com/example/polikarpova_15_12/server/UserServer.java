package com.example.polikarpova_15_12.server;

import com.example.polikarpova_15_12.connect.UserConnect;
import com.example.polikarpova_15_12.model.User;

public class UserServer {

    private UserConnect userConnect = new UserConnect();

    public UserServer(){}

    public  void saveUser(User user){

        userConnect.save(user);

    }

    public User findUser(int id){
        return userConnect.findId(id);
    }
}
