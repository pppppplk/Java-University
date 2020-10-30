package com.company;


import java.util.ArrayList;
import java.util.LinkedList;


public class Rand {


    public static void Addition() {
        LinkedList<Double> linkedList = new LinkedList<>();
        ArrayList<Double> arrayList = new ArrayList<>();

        int random = 1000000;
        //добавление рандомного чилсо из 1 000 000 в ArrayList и LinkedList
        for (int i = 0; i < random; i++) {
            linkedList.add(Math.random());
            arrayList.add(Math.random());
        }

        //выбираем из списка элемент наугад 100 000 раз
        int choice = 100000;
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();

        for (int i = 0; i < choice; i++) {
            arrayList.get((int) (Math.random() * arrayList.toArray().length - 1));
        }
        System.out.println(endTime - startTime);

        for (int i = 0; i < choice; i++) {
            linkedList.get((int) (Math.random() * linkedList.size() - 1));
        }
        System.out.println(endTime - startTime);

    }
}

    



