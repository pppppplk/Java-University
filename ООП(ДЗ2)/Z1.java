package com.company;

import java.util.Arrays;

public class Z1 {

    public static void main(String[] args) {

        int[][] two1 = {
                {1,2},
                {7,8}
        };
        int[][] two2 = {
                {4,8},
                {6,7}
        };
        System.out.println("   Матрица 1  ");
        for (int a=0; a<two2.length; a++){
            for(int b=0; b<two1[a].length; b++){

            }
            System.out.println(Arrays.toString(two1[a]));

        }
        System.out.println("   Матрица 2  ");
        for (int i=0; i<two1.length;i++ ){
            for(int j=0; j<two1[i].length; j++){

            }
            System.out.println(Arrays.toString(two2[i]));

        }
        int[][] sum_m = {
                {two1[0][0] + two2[0][0], two1[0][1]+two2[0][1]},
                {two1[1][0]+ two2[1][0], two1[1][1] + two2[1][1]}

        };
        System.out.println("Сумма матриц: ");

        for (int c=0; c<sum_m.length; c++){
            for(int qw=0; qw<sum_m[c].length; qw++){

            }
            System.out.println(Arrays.toString(sum_m[c]));

        }

        int[][] differ_m = {
                {two1[0][0] - two2[0][0], two1[0][1] - two2[0][1]},
                {two1[1][0] -  two2[1][0], two1[1][1] - two2[1][1]}

        };
        System.out.println("Разница матриц: ");

        for (int e=0; e<differ_m.length; e++){
            for (int y=0; y<differ_m[e].length; y++){

            }
            System.out.println(Arrays.toString(differ_m[e]));

        }
        int[][] mult_m = {
                {two1[0][0]*two2[0][0] + two1[0][1]*two2[1][0], two1[0][0]*two2[1][0] + two1[0][1]*two2[0][1]},
                {two1[1][0]*two2[0][0] + two1[1][1]*two2[1][0], two1[1][0]* two2[0][1] + two1[1][1]*two2[1][1]}
        };
        System.out.println("Произведение  матриц: ");
        for (int r=0; r<mult_m.length; r++){
            for (int t=0; t<mult_m[r].length; t++){

            }
            System.out.println(Arrays.toString(mult_m[r]));

        }

        int[][] tr1_m = {
                {two1[0][0], two1[1][0]},
                {two1[0][1], two1[1][1]}
        };
        System.out.println("Транспонирование  матрицы 1: ");
        for ( int u=0; u<tr1_m.length; u++){
            for (int op=0; op<tr1_m[u].length; op++){

            }
            System.out.println(Arrays.toString(tr1_m[u]));
        }
        int[][] tr2_m = {
                {two2[0][0], two2[1][0]},
                {two2[0][1], two2[1][1]}
        };
        System.out.println("Транспонирование  матрицы 2: ");
        for ( int ty=0; ty<tr1_m.length; ty++){
            for (int opu=0; opu<tr1_m[ty].length; opu++){

            }
            System.out.println(Arrays.toString(tr2_m[ty]));
        }

        int[][] power1_m = {
                {two1[0][0]* two1[0][0] + two1[0][1]*two1[1][0], two1[0][0]*two1[0][1]+ two1[0][1]*two1[1][1]},
                {two1[1][0]*two1[0][0] + two1[1][1]*two1[1][0], two1[1][0]*two1[0][1]+ two1[1][1]*two1[1][1]}
        };
        System.out.println("Возведение во 2 степень матрицы 1: ");
        for (int wer=0; wer<power1_m.length; wer++){
            for(int qa=0; qa<power1_m[wer].length; qa++){

            }
            System.out.println(Arrays.toString(power1_m[wer]));
        }

        int[][] power2_m = {
                {two2[0][0]* two2[0][0] + two2[0][1]*two2[1][0], two2[0][0]*two2[0][1]+ two2[0][1]*two2[1][1]},
                {two2[1][0]*two2[0][0] + two2[1][1]*two2[1][0], two2[1][0]*two2[0][1]+ two2[1][1]*two2[1][1]}
        };
        System.out.println("Возведение во 2 степень матрицы 2: ");
        for (int wert=0; wert<power2_m.length; wert++){
            for(int qar=0; qar<power2_m[wert].length; qar++){

            }
            System.out.println(Arrays.toString(power2_m[wert]));
        }


    }
}
