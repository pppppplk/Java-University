package com.company;
import java.util.Arrays;
import java.util.function.Function;
public class Main2 {

    public static Object[] filter (Object[] array, Filter filter){
        int offset = 0;
        for(int i = 0; i<array.length; i++){
            if(!filter.apply(array[i])){
                offset++;

            } else{
                array[i - offset] = array[i];
            }

        }
        return Arrays.copyOf(array, array.length - offset);
    }

     public static void main (String[] args){
            String array[] = new String[]{
                    "yyy", "hello", "1"};
            String[] newArray = (String []) filter(array, new Filter() {
                @Override
                public boolean apply(Object o) {
                    return o != null;
                }
            });
            for (int i = 0; i< newArray.length; i++) {
                System.out.println(newArray[i]);

            }

            Integer[] sq = new Integer[5];
            fill(sq, integer -> integer * integer);
            public static void fill (T[] objects, Function function){

                for (int i =0; i< objects.length; i++){
                    objects[i] = function.apply(i);
             }
         }

    }




}
