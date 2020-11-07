package com.company;

public class Z1 {

    public static String factorial(int n) {

        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return factorial(n - 1) + " " + n;
    }
    public static void main(String[] args) {

        System.out.println(factorial(5)); // вызов рекурсивной функции
    }

}
