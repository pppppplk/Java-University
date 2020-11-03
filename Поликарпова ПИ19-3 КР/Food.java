package com.company;

import java.util.HashSet;

public class Food  extends  Menu{


    public Food(String name, String existence,
                double price, HashSet<String>consist){
        this.name = name;
        this.existence = existence;
        this.price = price;
        this.consist = consist;

        menuListF.add(this);
        menu.put(name, this);

        if (existence == "Нет в наличии"){
            stopList.put(name, this);
        }

    }


}
