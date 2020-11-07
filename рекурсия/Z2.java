package com.company;


import java.util.Arrays;

public class Z2 {

    //перебор

    public static int BruteForce(double[] array, double key){

        for (int i = 0; i< array.length; i++){
            if(array[i] == key){
                return i;
            }

        }
        return -1;



    }

    //двоичный поиск
    public static int DoubleSearch(double[] array,double key,
                                   int low, int hight ){

        int middle = (hight + low)/ 2; //находим середину

        if (hight < low){
            return -1;
        }
        if (key == array[middle]){
            return middle;
        } else if (key < array[middle]){
            return DoubleSearch(array, key, low, middle -1 );
        } else{
            return DoubleSearch(array, key, low, middle +1 );
        }
    }

    // создаем метод для генерации рандомных чисел
    private static double[] Random(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();

        }

        return array;




    }



    public static void main(String[] args) {
        double[] array  = Random(10000);
        Arrays.sort(array);
        Z2.DoubleSearch(array, 5, 10, 5);
        Z2.BruteForce(array, 5);
        System.out.println("Время");
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);




    }




}
