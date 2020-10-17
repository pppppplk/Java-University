package com.company;

import java.util.Stack;

public abstract class StringBuilder {
    protected Stack<Action> actions;
    public StringBuilder(){
        actions = new Stack<>();
    }
    public void attach(Action action){
        actions.add(action);
    }

    public void detach(Action action){
        actions.remove(action);
    }
    protected abstract void notifyAction();
}
