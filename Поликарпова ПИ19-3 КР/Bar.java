package com.company;

import java.util.HashSet;

public class Bar  extends  Menu{


    public Bar(String name, String existence, String type,
                double price, HashSet<String>consist){
        this.name = name;
        this.existence = existence;
        this.type =type;
        this.price = price;
        this.consist = consist;

        menuListB.add(this);
        menu.put(name, this);

        if (existence == "Нет в наличии"){
            stopList.put(name, this);
        }

        if (type == "Алкогольный напиток"){
            System.out.println("Пожалуйста, покажите свои документы");
        }

    }


}



