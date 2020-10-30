package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intList= new ArrayList<>();
        ArrayList<Character> charList= new ArrayList<>();
        for (int i=0; i<15; i++){
            intList.add(i);
        }
        System.out.println(intList.size());
        ArrayList<Integer> intList2= new ArrayList<>();
        for (int j=0; j<20; j++){
            intList2.add(j);
        }
        ArrayList<Integer> intList3= new ArrayList<>();
        intList3.addAll(intList);
        intList3.addAll(intList2);
        Collection<Integer> coll = collection1.removeDuplicates(intList3);


    }



}
