package com.company;

public class Main2 {
    public static void main(String[] args) {
        SrtingB str = new SrtingB();
        DeleteAction observer = new DeleteAction() {
            @Override
            public void update (int LenghtStringApp) {
            }


        };
        //задаем номер и добавляем наблюдателя
        str.attach(observer);
        System.out.println("Задаем номер" + " " + str.getNumber(5) );
        // меняем номер и удаляем наблюдателя
        str.detach(observer);
        System.out.println("Меняем номер" +" " + str.setNumber(6));


    }
}
