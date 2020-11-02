package com.company;

import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        Integer[][] array = new Integer[][]{{1,2,5},
                {2,3,4,5,},{6},{8,9,10,12,}};
        Z1 iter = new Z1(array);
        for (;iter.hasNext();) {
            System.out.println(iter.next());
        }




    }
}
