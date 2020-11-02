package com.company;

import java.util.Date;

public  class Cards {

    String Name;
    double price;
    int num;
    boolean month;
    public Date date;

    public Cards (String Name) {
        this.Name = Name;
        this.month = false;
        this.num = 0;
        this.price = 0;
        this.date = new Date();
    }

    public void SetMonth(){
        if (this.Name.equals("Школьная") || this.Name.equals("Студенческая")){
            if(this.price >= 500){
                this.price -= 500;
                this.month = true;
                this.date = new Date();

            }else{
                System.out.println("Недостаточно средств на карте");
            }

        }else if (this.Name.equals("Социальная")){
            if(this.price >= 405){
                this.price -= 405;
                this.month = true;
                this.date = new Date();
            }else{
                System.out.println("Недостаточно средств на карте");
            }
        }
    }

    public void SetMoney(double i, CashMachine k) {
        if (k.price> i) {
            this.price += i;
            k.price -= i;

        } else {
            System.out.println("Недостаточно средств на карте");
        }
    }

    public void SetNum (int n) {
        if (this.price > n *10) {
            this.price -= n * 10;
            this.num += n;

        } else {
            System.out.println("Недостаточно средств на карте");

        }
    }

    @Override
    public String toString() {
        return "Cards{" +
                "Name='" + Name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", month=" + month +
                ", date=" + date +
                '}';
    }
}
