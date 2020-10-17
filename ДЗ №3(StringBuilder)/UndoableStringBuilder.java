package com.company;

import java.util.Stack;

public class UndoableStringBuilder {

    public void replace(int i, int i1, String str) {
        stringBuilder.replace(i, i1, str);

    }

    public class DeleteAction implements Action{
        public int size;

        public DeleteAction(int size){
            this.size = size;

        }

        public DeleteAction() {

        }

        @Override
        public void undo(){
            stringBuilder.delete(stringBuilder.length() - size, stringBuilder.length());
        }
    }

    public StringBuilder stringBuilder;
    public Stack<Action> actionStack = new Stack<>();

    public UndoableStringBuilder (StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void append (String st){
        stringBuilder.append(st);
        DeleteAction delac = new DeleteAction();
        actionStack.push(delac);
    }

    public void undo(){
        actionStack.pop().undo();
    }
}