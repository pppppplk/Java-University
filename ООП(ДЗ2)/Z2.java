package com.company;

public class Z2 {
    public static void main(String[] args) {
        double x1=1;
        double y1=2;
        double z1=3;

        Vector vector = new Vector(x1, y1, z1);
        System.out.println("*** Длина вектора ***");
        System.out.println(vector.vectorLength());
        System.out.println("*** Скалярное произведение ***");
        System.out.println(vector.scalarProduct());
        System.out.println("*** Векторное произведение  ***");
        System.out.println(vector.vectorProductOne());
        System.out.println(vector.vectorProductTwo());
        System.out.println(vector.vectorProductThree());
        System.out.println("*** Косинус угла  ***");
        System.out.println(vector.vectorCos());
        System.out.println("*** Сложение векторов  ***");
        System.out.print(vector.vectorSumOne());
        System.out.print(" ");
        System.out.print(vector.vectorSumTwo());
        System.out.print(" ");
        System.out.println(vector.vectorSumThree());
        System.out.println("*** Вычитание векторов  ***");
        System.out.print(vector.vectorSubOne());
        System.out.print(" ");
        System.out.print(vector.vectorSubTwo());
        System.out.print(" ");
        System.out.println(vector.vectorSubThree());
    }





}
