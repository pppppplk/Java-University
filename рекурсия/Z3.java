package com.company;

public class Z3 {

    public static double rec(double x){

        return x * 2 + 5  ;
    }

    public static double equation (double start_pos, double end_pos){
        if (end_pos - start_pos < 0.001){
            return start_pos;
        }
        double x = start_pos + (end_pos - start_pos / 2);

        if (rec(start_pos) * rec(x)  + 5 > 0){
            return equation(x, end_pos);
        } else {
            return equation(start_pos, x);
        }
    }
    public static void main(String[] args) {
        System.out.println(equation(0, 10));
    }






}