package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Menu {

    String name, existence;
    String type; // type - алкольный или безалкогольный напиток, 1 - напиток безалкогольный, 0 - напиток алкогольный
    double price;
    HashSet<String> consist;
    static HashMap<String, Menu> menu = new HashMap<>();
    HashMap<String, Menu> stopList = new HashMap<>();
    static ArrayList<Menu> menuListF = new ArrayList<>();
    static ArrayList<Menu> menuListB = new ArrayList<>();




    // меню кухни

    public String toStringF() {
        return "Название блюда: " + name + '\n' + "Цена: " + price  + ", " +
                " Состав: " +consist;
    }

    public static  void printMenuF() {
        for (Menu value : menuListF) {
            System.out.println(value.toStringF());
        }
    }

    @Override
    public String toString() {
        return "Название: " + name;
    }

    // барное меню
    public String toStringB() {
        return "Название напитка: " + name + '\n' + "Цена: " + price  + ", " +
                " Состав: " +consist + ","+ "\n"+
                "Вид: " + type ;
    }

    public static  void printMenuB() {

        for (Menu value :menuListB) {
            value = menuListB.get(menuListB.size()-1);
            System.out.println(value.toStringB());
        }

    }
}
