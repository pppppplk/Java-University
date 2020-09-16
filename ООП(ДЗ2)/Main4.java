package com.company;

public class Main4 {
    public static void main(String[] args) {
        Boxx box = new Boxx();
        box.SVolume(200);

        SQRTT sqrt = new SQRTT();
        sqrt.SVolume(50);

        boolean result = box.add(sqrt);
        System.out.println("Свободный объем: " + box.GVolume());

    }
}




