package com.company;

public class Maine {

    public static void main (String[] args){

        Cards card = new Cards("Социальная");

        CashMachine cash = new CashMachine(1500);

        card.SetMoney(200, cash);

        System.out.println(card);
    }
}
