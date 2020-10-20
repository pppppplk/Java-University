package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Game{

    static int[] field = {0, 0, 0,
                          0, 0, 0,
                          0, 0, 0 };



    public static void main(String[] args) {
        boolean per;
        boolean PressX = false;
        do {
            PressX = !PressX;
            DrawField();
            System.out.println("mark " + (PressX ? "X" : "O"));
            int n = getNumber();
            field[n] = PressX ? 1:2;
            per = !End(n);



        }while (per);
        DrawField();
        System.out.println();
        System.out.println("The winner is " + (PressX ? "X" : "O") + "!");



    }

    static boolean End(int n){

        int st = n- n%3;  //проверка номера строки
        if (field[st] == field[st +1] && field[st] == field[st+2])
            return true;
        int column = n&3; //проверям номер столбца
        if (field[column]==field[column +3 ] && field[column] == field[column +6])
            return true;
        if (n%2 != 0) //если значение на границе, то возвращаем  false
            return false;
        if (n%4 == 0){ // проверяем левую диагональ
            if (field[0] == field[4] && field[0] == field[8])
                return true;
            if (n%4 !=0)
                return false;
        }
        return field[2] == field[4] && field[2] == field[6];
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void DrawField(){
        System.out.println(" | " + " " + " | ");
        for (int i = 0; i< field.length; i++){
            if(i!=0){
                if(i%3==0){
                    System.out.println();
                    System.out.println("___|" + " " + "___|" + " " + "___|");
                    System.out.println(" | " + " " + " | ");
                }
                else{
                    System.out.println("|");
                }
                if (field[i]==0) System.out.print("  " + i + "  ");
                if (field[i]==1) System.out.print("  X  ");
                if (field[i]==2) System.out.print("  O  ");
            }
            System.out.println();
            System.out.println(" | " + " " + " | ");


        }

    }


}
