package com.example.polikarpova_15_12.server;

import com.example.polikarpova_15_12.connect.TestListConnect;
import com.example.polikarpova_15_12.model.TestList;

public class TestListServer {

    private TestListConnect testListConnect = new TestListConnect();

    public TestListServer(){}

    public  void saveTestList(TestList testList){

        testListConnect.save(testList);

    }

    public TestList findTestList(int id){
        return testListConnect.findId(id);
    }
}
