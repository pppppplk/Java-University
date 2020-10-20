package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    static int [] field = {1,0,0,
            0,2,0,
            0,0,0};


    // поле:
    // 0 1 2
    // 3 4 5
    // 6 7 8

    //выигрышные комбинации:
    //012, 345, 678, 036, 147, 258, 048, 246
    public static void main(String[] args){

        boolean perem;
        boolean PressX = false;
        do {
            PressX = !PressX;
            DrawField();
            System.out.println("Маркер " + (PressX ? "X" : "O"));
            int n = getNumber();
            field[n] = PressX ? 1 : 2;
            perem = !End(n);
            if (isDraw()){
                System.out.println("Рисуем");
                return;
            }
        } while (perem);
        DrawField();
        System.out.println();

        System.out.println("Выиграл: " + (PressX ? "X" : "O"));
    }

    static int getNumber(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                int n = Integer.parseInt(reader.readLine());
                if (n >= 0 && n < field.length && field[n]==0){
                    return n;
                }
                System.out.println("Choose free cell and enter its number");
            } catch (NumberFormatException e) {
                System.out.println("Please enter the number");
            } catch (IOException e) {
            }
        }
    }

    static boolean End(int n){

        int str = n-n%3; // проверяем номер сроки
        if (field[str]==field[str+1] &&  field[str]==field[str+2])
            return true;

        int column = n%3; // проверяем номер столбца
        if (field[column]== field[column+3])
            if (field [column]== field[column+6])
                return true;


        if (n%2!=0)
            return false;
        //проверяем диагонали ( приналедлежит ли значение к левой диаг)
        if (n%4==0){

            if (field[0] == field[4] &&  field[0] == field[8])
                return true;
            if (n!=4) return false;
        }
        return field[2] == field[4] && field[2] == field[6];
    }


    public static boolean isDraw() {
        for (int n : field) if (n==0) return false;
        return true;
    }

    static void DrawField(){
        System.out.println("     |     |     ");
        for (int i = 0; i < field.length; i++) {
            if (i!=0){
                if (i%3==0) {
                    System.out.println();
                    System.out.println("_____|_____|_____");
                    System.out.println("     |     |     ");
                }
                else
                    System.out.print("|");
            }

            if (field[i]==0) System.out.print("     ");
            if (field[i]==1) System.out.print("  X  ");
            if (field[i]==2) System.out.print("  O  ");
        }
        System.out.println();
        System.out.println("     |     |     ");
    }


}
