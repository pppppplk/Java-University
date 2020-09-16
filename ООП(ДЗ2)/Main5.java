package com.company;



public class Main5 {

    public static void main(String[] args) {

        int[] values = {1, 2, 3};
        int[] scales = {1, 2, 10};

        Back back = new Back(values, scales);
        int returnV = back.Number();
        System.out.println("Значение: "+returnV);
    }

}

