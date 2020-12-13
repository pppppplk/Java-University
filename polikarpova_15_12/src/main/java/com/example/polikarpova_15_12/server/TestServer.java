package com.example.polikarpova_15_12.server;

import com.example.polikarpova_15_12.connect.TestConnect;
import com.example.polikarpova_15_12.model.Test;

public class TestServer {

    private TestConnect testConnect = new TestConnect();

    public TestServer(){}

    public  void saveTest(Test test){

        testConnect.save(test);

    }

    public Test findTest(int id){
        return testConnect.findId(id);
    }
}
