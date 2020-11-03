package com.company;
import java.util.ArrayList;



public class Order {

    int NumOfTable;
    boolean CloseOrder;
    ArrayList<Double> scoreF = new ArrayList<>();
    ArrayList<Double> scoreD = new ArrayList<>();
    ArrayList<Menu> order = new ArrayList<>();

    public Order(int NumOfTable){
        this.NumOfTable = NumOfTable;
        this.CloseOrder = false;
        if(Table.tables.isEmpty()){
            this.CloseOrder = false;
            Table.tables.add(NumOfTable);
            System.out.println("******** Номер столика: " + NumOfTable + " *************");

        }else{
            System.out.println("Вы выбрали: " + NumOfTable + " столик");
            NumOfTable +=1;
            System.out.println("К сожалению, этот столик занят, мы можем предложить вам : " + NumOfTable + " столик");
            System.out.println("******** Номер столика: " + NumOfTable + " *************");


        }

    }

    public void AddFood(String name){
        if (!this.CloseOrder){

            if (Menu.menu.get(name).existence =="в наличии"){
                order.add(Menu.menu.get(name));
                scoreF.add(Menu.menu.get(name).price);

            }else{
                System.out.println( Menu.menu.get(name).toString() +  "\n Простите, но этого блюда нет в наличии ");
            }
        }else{
            System.out.println("Простите, но все столики заняты");
        }

    }

    public void AddDrink(String name){
        if (!this.CloseOrder){

            if (Menu.menu.get(name).type == "Безалкогольный"){
                order.add(Menu.menu.get(name));
                scoreD.add(Menu.menu.get(name).price);

            }else{
                System.out.println("Пожалуйста, покажите свои документы");
                scoreD.add(Menu.menu.get(name).price);
            }
        }else{

            System.out.println("Простите, но все столики заняты");

        }

    }



    public void PrintScoreF(){
        System.out.println("Счет за еду:" + " " + scoreF);

    }
    public void PrintScoreD(){
        System.out.println("Счет за бар:" + " " + scoreD);

    }


}

