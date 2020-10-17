package com.company;

public class SrtingB extends StringBuilder {
    int number;
    int number2;
    public int getNumber(int i){
        number += i;
        return number;
    }

    public int setNumber(int f){
        number2 += f;
        return number2;
    }
    @Override

    protected void notifyAction(){
        actions.forEach((action) -> { action.update(number); });
    }
}
