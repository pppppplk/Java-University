package com.company;

public class Main3 {
    public static void main(String[] args) {
        Box box = new Box();
        box.SVolume(200);

        SQRT sqrt = new SQRT();
        sqrt.SVolume(50);

        boolean result = box.add(sqrt);
        System.out.println("Свободный объем: " + box.GVolume());

    }
}
