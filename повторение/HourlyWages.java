package com.company;

public class HourlyWages {

    public String  NameHW;
    public int rate_per_hour, idHW;

    public HourlyWages ( String NameHW,int rate_per_hour, int idHW){

        this.NameHW = NameHW;
        this.rate_per_hour = rate_per_hour;
        this.idHW = idHW;
    }

    double average_monthly_salary(){

        return 20.8 * 8 * rate_per_hour;

    }

    String GetType() {
        return "Hourly Wages";
    }

    String GetName() {
        return this.NameHW;
    }



}
