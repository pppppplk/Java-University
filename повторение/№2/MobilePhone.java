package com.company;

public class MobilePhone {
    double price;

    public MobilePhone(){
        this.price = price;
        price = 0;
    }

    public void SetMoney(double i, CashMachine k){
        if (k.price > i) {
            this.price += i;
            k.price -= i;
        } else {
            System.out.println("Недостаточно средств на карте");

        }
    }
}
