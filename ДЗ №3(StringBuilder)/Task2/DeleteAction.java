package com.company;

public abstract class DeleteAction implements Action {
    public int LenghtStringApp;

    public int GetLenghtString(){
        return LenghtStringApp;
    }

    @Override
    public void update(int LenghtStringApp){
        this.LenghtStringApp = LenghtStringApp;

    }
}


