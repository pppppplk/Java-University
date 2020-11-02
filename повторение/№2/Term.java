package com.company;

public class Term {

    int num, people;
    double price;

    public Term(){
        this.num = num;
        this.people = people;
        this.price = price;

        num = 0;
        people = 0;
        price = 0;

    }

    public void put(Cards cards) {
        cards.month = false;
        if (cards.num > 0) {
            cards.num -= 1;
            System.out.println("Открыть");
        }else if (cards.price>= 60) {
            cards.price -= 60;
            System.out.println("Открыть");
        }else {
            System.out.println("Недостаточно средств на карте");
        }


    }



}
