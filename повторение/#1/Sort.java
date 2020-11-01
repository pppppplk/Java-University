package com.company;

class Sort {

    private Base[] elem1;
    private int len;

    public String GetName( int i) {

        return elem1[i].GetName();
    }

    public  double average_monthly_salary( int i) {

        return elem1[i].average_monthly_salary();
    }

    public String GetType( int i) {
        return elem1[i].GetType();
    }

    public void change(){
        Base sorting;

        //сортировка пузырьком
        int k=len-2;
        for (int j = 0; j <= len-2; j++) {

            for (int i = 0; i <= k; i++) {

                if (i+1<=len-2) {

                    if (elem1[i].average_monthly_salary()<elem1[i+1].average_monthly_salary()) {
                        sorting = elem1[i] ;
                        elem1[i] = elem1[i+1];
                        elem1[i+1] = sorting;
                    }

                }
            } k--;
        }

        System.out.println();


    }



    public void sort2(){
        Base sorting2;

        int k = len -2;
        for (int j = 0; j <= len-2; j++) {

            for ( int i = 0; i <= k; i++) {

                if (i+1<=len-2) {

                    if ((elem1[i].average_monthly_salary()==elem1[i+1].average_monthly_salary())
                            && elem1[i].GetName().compareTo(elem1[i+1].GetName()) >0 ) {
                        sorting2 = elem1[i] ;
                        elem1[i] = elem1[i+1];
                        elem1[i+1] = sorting2;
                    }

                }
            } k--;
        }
    }



    public static void main (String[] args){

        HourlyWages hourlyWages = new HourlyWages("Лиза Поликарпова",
                500, 1);
        System.out.println(hourlyWages.GetName()+" " + "Зарабатная плата " + hourlyWages.average_monthly_salary());


        FixedPayment fixedPayment = new FixedPayment("Максим Лобанов",
                100000, 2);

        System.out.println(fixedPayment.GetName()+" " +"Зарабатная плата " + fixedPayment.average_monthly_salary());

    }

}

