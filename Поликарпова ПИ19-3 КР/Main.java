package com.company;
import java.util.Arrays;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {

        Order table1 = new Order(1);

        Food dish1 = new Food("Рыба", "в наличии",550,
                new HashSet<String>(Arrays.asList("лосось ", "лимон ", "соус")));
        Food dish2 = new Food("Говядина", "в наличии",730,
                new HashSet<String>(Arrays.asList("говядина", "острый перец")));
        Food dish3 = new Food("Пельмени", "нет в наличии",350,
                new HashSet<String>(Arrays.asList("Пельмени")));


        Bar drink1 = new Bar("Coca-cola", "в наличии","Безалкогольный",70,
                new HashSet<String>(Arrays.asList("cola")));



        table1.AddFood("Рыба");
        table1.AddFood("Говядина");
        table1.AddDrink("Coca-cola");
        table1.AddFood("Пельмени");
        Menu.printMenuF();
        Menu.printMenuB();
        table1.PrintScoreF();
        table1.PrintScoreD();

        System.out.println("_____________________________");


        Order table2 = new Order(1);

        Bar drink2 = new Bar("Martini","в наличии", "алкогольный", 350,
                new HashSet<String>(Arrays.asList("Martini", "лёд")));


        table2.AddDrink("Martini");
        Menu.printMenuB();
        table2.PrintScoreD();




    }
}
