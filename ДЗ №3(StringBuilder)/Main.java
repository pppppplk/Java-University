package com.company;

public class Main {
    public static void main(String[] args) {
        StringBuilder strbuild = new StringBuilder();
        strbuild.append("Команда");
        UndoableStringBuilder undostr = new UndoableStringBuilder(strbuild);
        System.out.println("Изначальное слово = " + strbuild);
        strbuild.append("#1");
        System.out.println("append = " + strbuild);
        strbuild.reverse();
        System.out.println("reverse = " + strbuild);
        undostr.append("Приз");
        undostr.replace(0, 2, "qw");
        System.out.println(undostr);
        undostr.undo();
        System.out.println(undostr);


    }

}
