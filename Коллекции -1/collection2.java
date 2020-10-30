package com.company;
import java.util.*;
public class collection2 {

    /**
    public static void buildDictionary(String text){
        text = text.toLowerCase();
        int[] result = new int['я' - 'а' + 1];
        for (int i=0; i<text.length(); i++){
            char ch = text.charAt(i); //символ по индексу
            if ( ch >= 'а' && ch<= 'я'){
                result[ch - 'а']++;

            }
        }

        for( int i=0;i<result.length; i++){
            System.out.println((char)(i+'а') + "=" + result[i]);
        }
    }
    **/

    public static void buildDictionary1(String text1){
        text1 = text1.toLowerCase();
        Map<Character, Integer> map =new HashMap<>(); //создание словаря
        for(int i=0; i< text1.length(); i++){
            char ch = text1.charAt(i);

            if((ch>='а' && ch <= 'я') || ch=='ё'){ //проверка символов русского алфавита
                map.compute(ch, ((character, integer)->
                        integer == null ? 1 : integer +1)); //map.compute()-присвоение значений

            }
        }
        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        //map.entrySet()-возвращает множество пар, ключ. значений

        entries.sort((o1, o2)-> Character.compare(o1.getKey(), o2.getKey()));
        for (Map.Entry<Character, Integer> enter: entries){
            //Entry- берем один элемент из словаря
            System.out.println(enter.getKey() + "=" + enter.getValue());
        }

    }








}
